package com.useful.web.service;

import java.util.List;

import com.useful.web.domain.vo.MsgResultVO;

public interface MsgService {

	List<MsgResultVO> selectAllMsgResult();
}
