package com.useful.web.domain.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.useful.web.domain.vo.MsgResultVO;

@Repository
public class MsgResultDAO {

	@Autowired
	SqlSession sqlSession;
	
	public List<MsgResultVO> selectAllMsgResult(){
		return sqlSession.selectList("msgMapper.selectAllMsgResult");
	}
}
