package com.useful.web.domain.dao;

import java.util.List;

import com.useful.web.domain.vo.ReplyVO;

public interface ReplyDAO {
	// 댓글 조회
	public List<ReplyVO> list(int bno) throws Exception;

	// 댓글 작성
	public void write(ReplyVO vo) throws Exception;
	
	// 특정 댓글 조회
		public ReplyVO selectReply(int rno) throws Exception;

	// 댓글 수정
	public void updateReply(ReplyVO vo) throws Exception;
	
	// 댓글 삭제
	public void deletereply(ReplyVO vo) throws Exception;

	
}
