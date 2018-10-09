/**
 * 
 * 这个类就是创建一个高智商的人类
 * @author:zuoyan
 */
 
public class SmartManBuilder implements IBuildHuman{
	Human human;
	//构造方法
	public SmartManBuilder(){
		human = new Human();
	}

	@Override
	public void buildHead() {
		human.setHead("智商180的头脑");
	}

	@Override
	public void buildBody() {
		human.setBody("新的身体");

	}

	@Override
	public void buildHand() {
		human.setHand("新的手");
	}

	@Override
	public void buildFoot() {
		human.setFoot("新的脚");

	}

	@Override
	public Human createHuman() {
		return human;
	}

}

