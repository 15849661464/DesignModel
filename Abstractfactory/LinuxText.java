package com.zuoyan.abstractfactory;

public class LinuxText implements Text {

	@Override
	public void getWholeText() {

		System.out.println("Linux上的文本正在响应事件！");
	}

}
