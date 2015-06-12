package com.shine.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.shine.bean.UserTb;
import com.shine.dao.UserMapper;

public class UserMapperImpl extends SqlMapClientDaoSupport implements UserMapper{

	@Override
	public List<UserTb> selsectUser(String name) {
		
		//UserTb user =(UserTb) getSqlMapClientTemplate().queryForObject("selsectUser", name);
		List<UserTb> list =(List<UserTb>) getSqlMapClientTemplate().queryForList("selsectUser", name);
		return list;
	}

}
