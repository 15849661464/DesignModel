/**
 *
 * 我们如果想创造人类，得需要一个标准，所以创建这个接口，定义造人标准
 *
 *
 */
public interface IBuildHuman{
	public void buildHead();
	public void buildBody();
	public void buildHand();
	public void buildFoot();
	public Human createHuman();

}
