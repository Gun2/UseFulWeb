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
public class Blank2Controller {
	private static final Logger logger = LoggerFactory.getLogger(Blank2Controller.class);
	
	@RequestMapping(value = "/blank2", method = RequestMethod.GET)
	public String page(Locale locale, Model model) {
		logger.info("blank2", locale);
		return "blank/blank2";
	}
	
}
