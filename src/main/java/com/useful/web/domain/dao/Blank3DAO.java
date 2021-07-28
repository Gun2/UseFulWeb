package com.useful.web.domain.dao;

import java.util.List;

import com.useful.web.domain.vo.Blank3VO;

public interface Blank3DAO {
	public List<Blank3VO> list() throws Exception;

	public void write(Blank3VO vo) throws Exception;

	public Blank3VO view(int bno) throws Exception;

	public void modify(Blank3VO vo) throws Exception;

	// 게시뮬 삭제
	public void delete(int bno) throws Exception;

	void updateViewCnt(int bno) throws Exception;


	
}

