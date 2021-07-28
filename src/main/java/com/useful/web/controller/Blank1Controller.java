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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.useful.web.domain.dto.ChatDTO;
import com.useful.web.domain.dto.PageDTO;
import com.useful.web.domain.vo.LottoResultVO;
import com.useful.web.domain.vo.MsgResultVO;
import com.useful.web.service.MsgService;
import com.useful.web.utils.CommonUtil;

/**
 * Handles requests for the application home page.
 */
@Controller
public class Blank1Controller {
	private static final Logger logger = LoggerFactory.getLogger(Blank1Controller.class);

	@Autowired
	MsgService msgService;

	/*
	 * @RequestMapping(value = "/blank1", method = RequestMethod.GET) public String
	 * page(Locale locale, Model model) { logger.info("blank1", locale); return
	 * "blank/blank1"; }
	 */
	
	/*
	 * @RequestMapping(value = "/blank1", method = RequestMethod.GET) public String
	 * getList(Locale locale, Model model) throws Exception { logger.info("blank1",
	 * locale); List<LottoResultVO> list = null; list = msgService.list();
	 * 
	 * model.addAttribute("list", list); return "blank/blank1"; }
	 */

	/*
	 * @RequestMapping(value = "/blank1/test", method = RequestMethod.GET) public
	 * String pageTest(Locale locale, Model model) {
	 * 
	 * msgService.test();
	 * 
	 * return "blank/blank1"; }
	 */

	/*
	 * @RequestMapping(value = "/blank1/list", method = RequestMethod.GET) public
	 * String getList(Locale locale, Model model) throws Exception {
	 * logger.info("blank1", locale); List<LottoResultVO> list = null; list =
	 * msgService.list();
	 * 
	 * model.addAttribute("list", list); return "blank/blank1"; }
	 */

	@RequestMapping(value = "/blank1", method = RequestMethod.GET)
	public String getListpage(Locale locale, Model model, @RequestParam(value = "num", required = false ,defaultValue = "1") int num,
			@RequestParam(value = "searchType", required = false, defaultValue = "lt_drw_no") String searchType,
			@RequestParam(value = "keyword", required = false, defaultValue = "") String keyword) throws Exception {
		logger.info("blank1", locale);

		PageDTO page = new PageDTO();

		page.setNum(num);
		//page.setCount(msgService.count());
		page.setCount(msgService.searchCount(page.getDisplayPost(), page.getPostNum(), searchType, keyword));
		
		
		//page.setSearchTypeKeyword(searchType, keyword);
		page.setSearchType(searchType);
		page.setKeyword(keyword);
		
		List<LottoResultVO> list = null;
		// list = msgService.listPage(page.getDisplayPost(), page.getPostNum());
		list = msgService.listPageSearch(page.getDisplayPost(), page.getPostNum(), searchType, keyword);

		model.addAttribute("list", list);
		model.addAttribute("page", page);
		model.addAttribute("select", num);

//		model.addAttribute("searchType", searchType);
//		model.addAttribute("keyword", keyword);
		
		return "blank/blank1";
	}
}
