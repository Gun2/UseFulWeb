package com.useful.web.domain.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.useful.web.domain.dto.ChatDTO;
import com.useful.web.domain.vo.MsgResultVO;

@Repository
public class MsgResultDAO {

	@Autowired
	SqlSession sqlSession;
	
	public List<MsgResultVO> selectAllMsgResult(){
		return sqlSession.selectList("msgMapper.selectAllMsgResult");
	}
	
	public JSONArray selectRecentChat(int limit) {
		List<HashMap> recentChatHmList = sqlSession.selectList("msgMapper.selectRecentChat", limit);
		
		return new JSONArray(recentChatHmList);
	}
	
	public int insertChat(ChatDTO dto) {
		return sqlSession.insert("msgMapper.insertChat", dto);
	}
}
