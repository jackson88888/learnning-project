package com.service;

import java.util.List;

import com.vo.User;

public interface IService {
	// 1.简单的数据类型
	public String GetMessage(String msg);

	// 2.自定义的数据类型
	public User getOne();

	// 3.复杂的数据类型
	public List<User> getAll();
	//4.新添加服务
	public int add(int a,int b);
	
}
