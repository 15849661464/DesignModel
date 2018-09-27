/**
 * MysqlFactory 实现数据库抽象工厂
 */


public class MysqlFactory implements DataFactory{


	//重写父类的creatUser  方法
	public IUser createUser()
	{
		return new MysqlUser();
	}
}
