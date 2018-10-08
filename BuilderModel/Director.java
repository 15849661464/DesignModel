/**
 *
 * 这个是建造者模式的精髓，director 
 * 作用：执行我们刚才的造人的动作的。没错，精髓就是我们刚才造人的动作
 */
public class Director{
	public Human createHumanByDirector(IBuildHuman bh){
		bh.buildBody();
		bh.buildFoot();
		bh.buildHand();
		bh.buildHead();
		return bh.createHuman();
	}
}
