package com.useful.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.useful.web.domain.vo.ReplyVO;
import com.useful.web.service.ReplyService;

@Controller
@RequestMapping("/reply/*")
public class ReplyController {
	@Inject
	private ReplyService replyService;

	// 댓글 작성
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String posttWirte(ReplyVO vo) throws Exception {

		replyService.write(vo);

		return "redirect:/board/view?bno=" + vo.getBno();
	}

	

	}

