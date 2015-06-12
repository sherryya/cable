package com.shine.service.impl;

import java.util.List;

import com.shine.bean.UserTb;
import com.shine.dao.UserMapper;
import com.shine.service.UserService;

public class UserServiceImpl implements UserService {
	private UserMapper userdao;

	public UserMapper getUserdao() {
		return userdao;
	}

	public void setUserdao(UserMapper userdao) {
		this.userdao = userdao;
	}

	@Override
	public List<UserTb> selsectUser(String name) {
		// TODO Auto-generated method stub
		return userdao.selsectUser(name);
	}
	

}
