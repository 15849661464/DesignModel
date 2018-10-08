/**
 * Builder 模式的测试方法
 * 这个造人的建造者模式 这能创建高智商的人类，但是如果我要想创建一个运动员，只需要像高智商
 * 人类那样创建好类，然后传进来就可以了，  
 * 总结：我们不需要知道怎样造人，这个过程让director给代劳了。我的的SmartManBuilder类中才是真正的造人方法
 * director 其实只是执行了过程。这样子，达到了分离模块的功能。  造人的过程，启动造人的过程，和最后选择
 * 那种人来造。都分的清清楚楚的。这就有了一些模块化的感觉，这样维护和拓展都是很方便的
 */
public class BuilderTest {
	public static void main(String [] args)
	{
		Director director = new Director();
		Human human = director.createHumanByDirector(new SmartManBuilder());
		System.out.println(human.getHead());
		System.out.println(human.getBody());
		System.out.println(human.getHand());
		System.out.println(human.getFoot());
	}
}
