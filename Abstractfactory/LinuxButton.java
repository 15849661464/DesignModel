package com.zuoyan.abstractfactory;

public class LinuxButton implements Button {

	@Override
	public void processEvent() {
		System.out.println("Linux 上的Button正在处理事件  ");

	}

}
