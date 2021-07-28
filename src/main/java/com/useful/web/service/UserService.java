package com.useful.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.useful.web.domain.dao.UserMapper;
import com.useful.web.domain.vo.User;


@Service
public class UserService {
	@Autowired UserMapper userMapper;
	
	public void createUser(User user) {
		userMapper.createUser(user);
	}

}
