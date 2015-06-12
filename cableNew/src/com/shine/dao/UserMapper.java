package com.shine.dao;

import java.util.List;

import com.shine.bean.UserTb;

public interface UserMapper {
	
	List<UserTb> selsectUser(String name);

}
