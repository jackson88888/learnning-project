package com.service;

import java.util.List;

import com.vo.User;

public interface IService {
	// 1.�򵥵���������
	public String GetMessage(String msg);

	// 2.�Զ������������
	public User getOne();

	// 3.���ӵ���������
	public List<User> getAll();
	//4.����ӷ���
	public int add(int a,int b);
	
}
