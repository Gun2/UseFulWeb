package com.useful.web.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.useful.web.domain.dao.ReplyDAO;
import com.useful.web.domain.vo.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;

	// 댓글 조회
	@Override
	public List<ReplyVO> list(int bno) throws Exception {
		return dao.list(bno);
	}

	@Override
	public void write(ReplyVO vo) throws Exception {
		dao.write(vo);
	}

	@Override
	public ReplyVO selectReply(int rno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void replyUpdate(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void replyDelete(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
