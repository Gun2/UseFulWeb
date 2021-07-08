package com.useful.web.service.impl;

import java.util.List;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.useful.web.domain.dao.MsgResultDAO;
import com.useful.web.domain.dto.ChatDTO;
import com.useful.web.domain.vo.MsgResultVO;
import com.useful.web.service.MsgService;

@Service
public class MsgServiceImpl implements MsgService{

	@Autowired
	private MsgResultDAO msgResultDAO;
	
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
	
	
	
}
