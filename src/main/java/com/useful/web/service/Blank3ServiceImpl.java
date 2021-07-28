package com.useful.web.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.useful.web.controller.Blank1Controller;
import com.useful.web.domain.dao.Blank3DAO;
import com.useful.web.domain.vo.Blank3VO;

@Service
public class Blank3ServiceImpl implements Blank3Service {
	private static final Logger logger = LoggerFactory.getLogger(Blank3Service.class);
	@Inject
	private Blank3DAO dao;
	

	@Override
	public List<Blank3VO> list() throws Exception {
		
		return dao.list();
	}

	@Override
	public void write(Blank3VO vo) throws Exception {
		dao.write(vo);
		// TODO Auto-generated method stub

	}

	@Override
	public Blank3VO view(int bno) throws Exception {
		dao.updateViewCnt(bno);
		return dao.view(bno);
	}

	@Override
	public void modify(Blank3VO vo) throws Exception {

		dao.modify(vo);
	}

	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}
	


}
