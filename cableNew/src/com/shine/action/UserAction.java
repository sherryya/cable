package com.shine.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.shine.bean.UserTb;
import com.shine.service.UserService;

public class UserAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	private UserService userDaoService;
	private String name;
	public String login()
	{
		List<UserTb> userTb = userDaoService.selsectUser(name);
		if(userTb!=null && userTb.size()>0)
		{
			return "success";
		}
		return "fail";
	}
	public UserService getUserDaoService() {
		return userDaoService;
	}
	public void setUserDaoService(UserService userDaoService) {
		this.userDaoService = userDaoService;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
