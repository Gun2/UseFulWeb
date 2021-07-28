package com.useful.web.domain.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.useful.web.domain.vo.Blank3VO;
import com.useful.web.domain.vo.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {
	@Inject
	private SqlSession sql;

	private static String namespace = "com.board.mappers.reply";

	// 댓글 조회
	@Override
	public List<ReplyVO> list(int bno) throws Exception {
		return sql.selectList(namespace + ".replyList", bno);
	}

	// 댓글 작성
	@Override
	public void write(ReplyVO vo) throws Exception {
		sql.insert(namespace + ".replyWrite", vo);
	}

	// 댓글 수정
	@Override
	public void updateReply(ReplyVO vo) throws Exception {
		sql.update(namespace + ".updateReply", vo);
	}

	// 댓글 삭제
	@Override
	public void deletereply(ReplyVO vo) throws Exception {
		sql.delete(namespace + ".deletereply", vo);
	}

	@Override
	public ReplyVO selectReply(int rno) throws Exception {
		return sql.selectOne(namespace + ".deletereply", rno);
	}
}
