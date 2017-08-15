package com.service;

import java.util.ArrayList;
import java.util.List;

import com.vo.User;

public class ServiceImpl implements IService {

	public String GetMessage(String msg) {
		
		return "这是一个标准的Xfire的测试程序,返回的结果是 : "+msg;
	}

	public List<User> getAll() {
		List<User> list=new ArrayList<User>();
		User u1=new User();
		u1.setAge(12);
		u1.setUsername("Tom");
		User u2=new User();
		u2.setAge(22);
		u2.setUsername("jacky");
		User u3=new User();
		u3.setAge(32);
		u3.setUsername("mary");
		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
	}

	public User getOne() {
		User u=new User();
		u.setAge(12);
		u.setUsername("Tom");
		return u;
	}

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
