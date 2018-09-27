package com.zuoyan.abstractfactory;

public class WindowsText implements Text {

	@Override
	public void getWholeText() {
		System.out.println("Window的文本组件正在获取响应事件！");

	}

}
