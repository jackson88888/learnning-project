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
	 * ����Xfire�Ŀͻ���
	 */
	public static void main(String[] args) {
		// ����һ���������(Զ�̵���),ʹ�÷���Ĺ�������ws�ķ������
		Service srcvMode = new ObjectServiceFactory().create(IService.class);
		//�������ô�����,��ȡ����
		XFireProxyFactory factory=new XFireProxyFactory(XFireFactory.newInstance().getXFire());
		String serviceURL="http://localhost:8080/Xfire/services/XfireService";
		IService serv=null;
		//��ȡ����
		try {
			serv=(IService) factory.create(srcvMode, serviceURL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		//���ü򵥵�WS����
		String string=serv.GetMessage("��ֵ�Ĳ���");
		System.out.println(string);
		//�����Զ���Ķ�������
		User user=serv.getOne();
		System.out.println("***************");
		System.out.println(user.getUsername()+"   "+user.getAge());
		//�������ݵļ���
		System.out.println("***************");
		List<User> list=serv.getAll();
		for(User u :list ){
			System.out.println(u.getUsername()+"   "+u.getAge());
		}
	}

}










