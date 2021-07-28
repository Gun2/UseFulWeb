package com.useful.web.domain.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.useful.web.domain.dto.ChatDTO;
import com.useful.web.domain.dto.LottoDTO;
import com.useful.web.domain.vo.LottoResultVO;
import com.useful.web.domain.vo.MsgResultVO;

@Repository
public class LottoDisplayDAO {

	@Autowired
	SqlSession sqlSession;

	public List<LottoResultVO> list() throws Exception {
		return sqlSession.selectList("lottoMapper.selectRound");
	}

	public int insertlotto(LottoDTO dto) {
		return sqlSession.insert("lottoMapper.insertLotto", dto);
	}

	public int count() throws Exception {
		return sqlSession.selectOne("lottoMapper.count");
	}

	public List listPage(int displayPost, int postNum) throws Exception {
		HashMap data = new HashMap();

		data.put("displayPost", displayPost);
		data.put("postNum", postNum);

		return sqlSession.selectList("lottoMapper.listPage", data);
	}

	public List listPageSearch(int displayPost, int postNum, String searchType, String keyword) throws Exception {
		HashMap<String, Object> data = new HashMap<String, Object>();

		data.put("displayPost", displayPost);
		data.put("postNum", postNum);

		data.put("searchType", searchType);
		data.put("keyword", keyword);

		return sqlSession.selectList("lottoMapper.listPageSearch", data);
	}
	
	public int searchCount(String searchType, String keyword) throws Exception
	{
		 HashMap data = new HashMap();
		 
		 data.put("searchType", searchType);
		 data.put("keyword", keyword);
		 
		 return sqlSession.selectOne("lottoMapper.searchCount", data); 
	}
	
	public int searchCount(int displayPost, int postNum, String searchType, String keyword) throws Exception
	{
		HashMap<String, Object> data = new HashMap<String, Object>();

		data.put("displayPost", displayPost);
		data.put("postNum", postNum);

		data.put("searchType", searchType);
		data.put("keyword", keyword);
		 
		 return sqlSession.selectOne("lottoMapper.searchCount", data); 
	}
}
