package com.useful.web.service;

import java.util.List;

import org.json.JSONArray;

import com.useful.web.domain.dto.ChatDTO;
import com.useful.web.domain.vo.MsgResultVO;

public interface MsgService {

	List<MsgResultVO> selectAllMsgResult();
	
	//최근 x개 메시지 반환
	JSONArray selectRecentChat(int limit);
	
	//chat 삽입
	int insertChat(ChatDTO dto);
}
