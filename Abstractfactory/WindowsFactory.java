package com.zuoyan.abstractfactory;

public class WindowsFactory implements AbstractFactory {

	@Override
	public Button createButton() {
		return new WindowButton();
	}

	
	@Override
	public Text createText() {
		return new WindowsText();
	}

}
