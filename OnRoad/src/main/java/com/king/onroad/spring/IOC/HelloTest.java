/**
 * onroad->com.king.onroad.spring.IOC->HelloTest.java
 * Copyright (c) 2015 sinosoft  Co. Ltd.
 * All right reserved.
 */
package com.king.onroad.spring.IOC;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2015</p>
 * <p>Company: Sinosoft</p>
 * @author Administrator
 * @version 1.0
 * @date: 2015��1��22�� ����4:11:16
 */
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest
{
	@Test
	public void testHelloWorld()
	{
		// 1����ȡ�����ļ�ʵ����һ��IoC����

		ApplicationContext context =
				new ClassPathXmlApplicationContext("helloworld.xml");
		// 2���������л�ȡBean��ע��˴���ȫ������ӿڱ�̣�����������ʵ�֡�
		HelloApi helloApi = context.getBean("hello", HelloApi.class);
		// 3��ִ��ҵ���߼�
		helloApi.sayHello();
	}
}
