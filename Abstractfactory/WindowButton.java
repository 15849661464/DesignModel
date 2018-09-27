package com.zuoyan.abstractfactory;

public class WindowButton implements Button {

	@Override
	public void processEvent() {
		
			System.out.println("Windows 正在处理响应事件！！！");
	}

}
