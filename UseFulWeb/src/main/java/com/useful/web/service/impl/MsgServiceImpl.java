package com.useful.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.useful.web.domain.dao.MsgResultDAO;
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
	
	

}
