package com.rl.client;

import com.rl.hello.HelloServer;
import com.rl.hello.HelloServerService;

public class TestPersonClient {
	
	public static void main(String[] args) {
		
		//创建服务访问点集合
		HelloServerService hss = new HelloServerService();
		//根据服务访问点获得绑定的类
		HelloServer server = hss.getHelloServerPort();
		//调用具体业务逻辑
		String result = server.sayHello("zhangsan");
		System.out.println(result);
	}

}
