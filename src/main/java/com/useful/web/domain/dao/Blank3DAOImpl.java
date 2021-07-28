package com.useful.web.domain.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.useful.web.domain.vo.Blank3VO;

@Repository
public class Blank3DAOImpl implements Blank3DAO {

	@Inject
	private SqlSession sql;

	private static String namespace = "com.board.mappers.Blank3";

	// 게시물 목록
	@Override
	public List<Blank3VO> list() throws Exception {

		return sql.selectList(namespace + ".list");
	}

	@Override
	public void write(Blank3VO vo) throws Exception {
		sql.insert(namespace + ".write", vo);
		// TODO Auto-generated method stub

	}
	
	@Override
	public Blank3VO view(int bno) throws Exception {

		return sql.selectOne(namespace + ".view", bno);
	}

	@Override
	public void modify(Blank3VO vo) throws Exception {
		sql.update(namespace + ".modify", vo);
	}

	public void delete(int bno) throws Exception {
		sql.delete(namespace + ".delete", bno);
	}

	@Override
	public void updateViewCnt(int bno) throws Exception {
		sql.update(namespace + ".updateViewCnt", bno);
	}

}
