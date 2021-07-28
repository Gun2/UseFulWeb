package com.useful.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.useful.web.domain.vo.Blank3VO;
import com.useful.web.domain.vo.ReplyVO;
import com.useful.web.domain.vo.User;
import com.useful.web.service.Blank3Service;
import com.useful.web.service.ReplyService;
import com.useful.web.service.UserService;

@Controller
public class Blank3Controller {
	private static final Logger logger = LoggerFactory.getLogger(Blank1Controller.class);
	@Inject
	private Blank3Service service;
	@Inject
	private ReplyService replyService;
	
	@Autowired
	UserService userService;
	 
	@RequestMapping(value = "/blank3", method = RequestMethod.GET)
	public String page(Locale locale, Model model) {
		logger.info("blank3", locale);
		return "blank/blank3";
	}

	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String getList(Locale locale, Model model) throws Exception {
		List<Blank3VO> list = service.list();
		model.addAttribute("list", list);

		return "board/list";
	}

	@RequestMapping(value = "/board/write", method = RequestMethod.GET)
	public void getWirte() throws Exception {
	}

	@RequestMapping(value = "/board/write", method = RequestMethod.POST)
	public String posttWirte(Blank3VO vo) throws Exception {
		service.write(vo);
		return "redirect:/board/list";

	}

	// 게시물 조회
	@RequestMapping(value = "/board/view", method = RequestMethod.GET)
	public void getView(@RequestParam("bno") int bno, Model model) throws Exception {
		logger.info("board/view test");
		Blank3VO vo = service.view(bno);
		model.addAttribute("view", vo);
		

		
		List<ReplyVO> reply = null;
		reply = replyService.list(bno);
		model.addAttribute("reply", reply);
	}
	// 게시물 수정
	@RequestMapping(value = "/board/modify", method = RequestMethod.GET)
	public void getModify(@RequestParam("bno") int bno, Model model) throws Exception {

		Blank3VO vo = service.view(bno);

		model.addAttribute("view", vo);
	}

	@RequestMapping(value = "/board/modify", method = RequestMethod.POST)
	public String postModify(Blank3VO vo) throws Exception {

		service.modify(vo);

		return "redirect:/board/view?bno=" + vo.getBno();
	}

	@RequestMapping(value = "/board/delete", method = RequestMethod.GET)
	public String getDelete(@RequestParam("bno") int bno) throws Exception {

		service.delete(bno);

		return "redirect:/board/list";
	}
	
	@RequestMapping(value="/board/signup",method=RequestMethod.GET)
	public String getsignup(Locale locale, Model model) {
		logger.info("Welcome Home! the client locale is {}.",locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG,locale);
		String formattedDate =  dateFormat.format(date);
		model.addAttribute("serverTime",formattedDate);
		return "/board/signup";
	}
	@RequestMapping(value="/board/signup",method=RequestMethod.POST)
	public String postsignup(User user) {
		userService.createUser(user);
		logger.info("user sign up!");
		
		return "redircet:/blank3";
	}

	

}
