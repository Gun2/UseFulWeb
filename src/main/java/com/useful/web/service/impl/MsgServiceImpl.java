package com.useful.web.service.impl;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.useful.web.domain.dao.LottoDisplayDAO;
import com.useful.web.domain.dao.MsgResultDAO;
import com.useful.web.domain.dto.ChatDTO;
import com.useful.web.domain.dto.LottoDTO;
import com.useful.web.domain.vo.LottoResultVO;
import com.useful.web.domain.vo.MsgResultVO;
import com.useful.web.service.MsgService;
import com.useful.web.utils.GetLottoData;

@Service
public class MsgServiceImpl implements MsgService {

	@Autowired
	private MsgResultDAO msgResultDAO;

	@Autowired
	private LottoDisplayDAO lottoDisplayDAO;

	@Override
	public List<MsgResultVO> selectAllMsgResult() {
		// TODO Auto-generated method stub
		return msgResultDAO.selectAllMsgResult();
	}

	@Override
	public JSONArray selectRecentChat(int limit) {
		// TODO Auto-generated method stub
		return msgResultDAO.selectRecentChat(limit);
	}

	@Override
	public int insertChat(ChatDTO dto) {
		// TODO Auto-generated method stub
		return msgResultDAO.insertChat(dto);
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 971; i++) {
			JSONObject jo = new JSONObject(GetLottoData.getLottoResultByDrwNo(i));
			LottoDTO dto = new LottoDTO();
			dto.setLt_drw_no(jo.getInt("drwNo"));
			dto.setLt_drwt_no_1(jo.getInt("drwtNo1"));
			dto.setLt_drwt_no_2(jo.getInt("drwtNo2"));
			dto.setLt_drwt_no_3(jo.getInt("drwtNo3"));
			dto.setLt_drwt_no_4(jo.getInt("drwtNo4"));
			dto.setLt_drwt_no_5(jo.getInt("drwtNo5"));
			dto.setLt_drwt_no_6(jo.getInt("drwtNo6"));
			dto.setLt_tot_sell_amnt(jo.getLong("totSellamnt"));
			dto.setLt_first_win_amnt(jo.getLong("firstWinamnt"));
			dto.setLt_drw_date(jo.getString("drwNoDate"));
			lottoDisplayDAO.insertlotto(dto);

		}

	}

	public List<LottoResultVO> list() throws Exception {
		return lottoDisplayDAO.list();
	}

	public int count() throws Exception {
		return lottoDisplayDAO.count();
	}

	public List listPage(int displayPost, int postNum) throws Exception {
		return lottoDisplayDAO.listPage(displayPost, postNum);
	}

	public List listPageSearch(int displayPost, int postNum, String searchType, String keyword)
			throws Exception {
		return lottoDisplayDAO.listPageSearch(displayPost, postNum, searchType, keyword);
	}
	
	public int searchCount(String searchType, String keyword) throws Exception {
		 return lottoDisplayDAO.searchCount(searchType, keyword);
		}
	
	
		/*
		 * private String searchTypeKeyword;
		 * 
		 * public void setSearchTypKeyword(String searchType, String keyword) {
		 * 
		 * if(searchType.equals("") || keyword.equals("")) { searchTypeKeyword = ""; }
		 * else { searchTypeKeyword = "&searchType=" + searchType + "&keyword=" +
		 * keyword; } }
		 */
	
	@Override
	public int searchCount(int displayPost, int postNum, String searchType, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return lottoDisplayDAO.searchCount(displayPost, postNum, searchType, keyword);
	}

	public String getSearchTypeKeyword() {
		 
		 if(searchType.equals("") || keyword.equals("")) {
		  return ""; 
		 } else {
		  return "&searchType=" + searchType + "&keyword=" + keyword; 
		 }
		}

		private String searchType;
		private String keyword; 

		public void setSearchType(String searchType) {
		 this.searchType = searchType;  
		}

		public String getSearchType() {
		 return searchType;
		} 

		public void setKeyword(String keyword) {
		 this.keyword = keyword;  
		} 

		public String getKeyword() {
		 return keyword;
		}
}
