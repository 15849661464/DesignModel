package com.zuoyan.abstractfactory;
/**
 * 系统的产品多余一个产品族，而系统只消费某个产品族
 * 优点  当多个产品族的多个对象被设计成一起工作时，它能保证客户端始终使用同一个
 * 族的对象
 * @author zuoyan
 *
 */
public class AbstractFactoryDemoMain {

	public static void main(String[] args) {
		AbstractFactory linuxFactory = new LinuxFactory();
		linuxFactory.createButton().processEvent();
		linuxFactory.createText().getWholeText();
		
		AbstractFactory windowsFactory = new WindowsFactory();
		windowsFactory.createButton().processEvent();
		windowsFactory.createText().getWholeText();
		
	}
}
