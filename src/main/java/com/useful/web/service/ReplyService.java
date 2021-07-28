package com.useful.web.service;

import java.util.List;

import com.useful.web.domain.vo.ReplyVO;

public interface ReplyService {
	// 댓글 조회
	public List<ReplyVO> list(int bno) throws Exception;

	// 댓글 조회
	public void write(ReplyVO vo) throws Exception;

	// 특정 댓글 조회

	public ReplyVO selectReply(int rno) throws Exception;

	// 댓글 수정
	public void replyUpdate(ReplyVO vo) throws Exception;

	// 댓글 삭제
	public void replyDelete(ReplyVO vo) throws Exception;

}
