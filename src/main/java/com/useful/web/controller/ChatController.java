package com.useful.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.useful.web.domain.dto.ChatDTO;
import com.useful.web.domain.vo.MsgResultVO;
import com.useful.web.service.MsgService;
import com.useful.web.utils.CommonUtil;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ChatController {
	
	private static final Logger logger = LoggerFactory.getLogger(ChatController.class);
	
	@Autowired
	private MsgService msgService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("chat page");
		
		return "chat/chat";
	}

	@RequestMapping(value="/api/msg/recent.do", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity recentChat(HttpServletRequest request,ModelMap model) throws Exception{
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		
		JSONArray recentMsgList = msgService.selectRecentChat(100);
		JSONObject result = new JSONObject();
		result.put("myIp", request.getRemoteAddr());
		result.put("msgList", recentMsgList);
		return new ResponseEntity(result.toString(),responseHeaders, HttpStatus.CREATED);
	}	
	
	@RequestMapping(value="/api/msg/chat.do", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity postChat(HttpServletRequest request,ModelMap model) throws Exception{
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		String own = CommonUtil.getClientIp(request);
		String msg = request.getParameter("msg");
		ChatDTO chatDTO = new ChatDTO();
		chatDTO.setOwn(own);
		chatDTO.setMsg(msg);
		
		int result = msgService.insertChat(chatDTO);

		return new ResponseEntity(String.valueOf(result),responseHeaders, HttpStatus.CREATED);
	}	
	
}
