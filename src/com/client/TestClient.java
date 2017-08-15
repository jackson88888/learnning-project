package com.client;

import java.net.MalformedURLException;
import java.util.List;

import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

import com.service.IService;
import com.vo.User;

public class TestClient {

	/**
	 * 测试Xfire的客户端
	 */
	public static void main(String[] args) {
		// 创建一个服务对象(远程调用),使用服务的工厂创建ws的服务对象
		Service srcvMode = new ObjectServiceFactory().create(IService.class);
		//创建调用代理工厂,获取服务
		XFireProxyFactory factory=new XFireProxyFactory(XFireFactory.newInstance().getXFire());
		String serviceURL="http://localhost:8080/Xfire/services/XfireService";
		IService serv=null;
		//获取服务
		try {
			serv=(IService) factory.create(srcvMode, serviceURL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		//调用简单的WS方法
		String string=serv.GetMessage("单值的测试");
		System.out.println(string);
		//调用自定义的对象类型
		User user=serv.getOne();
		System.out.println("***************");
		System.out.println(user.getUsername()+"   "+user.getAge());
		//调用数据的集合
		System.out.println("***************");
		List<User> list=serv.getAll();
		for(User u :list ){
			System.out.println(u.getUsername()+"   "+u.getAge());
		}
	}

}










