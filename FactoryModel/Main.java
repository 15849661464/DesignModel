/**
 *
 *
 * 工厂模式测试的主方法
 */

public class Main
{
	public static void main(String [] args)
	{
		//创建数据库工厂
		//如果需要修改数据库 只需要将new MysqlFactory() 修改为 new OracleFactory()
		DataFactory factory = new MysqlFactory();
		//创建对应数据库的操作对象
		IUser iu = factory.createUser();
		iu.insert("这个是一个测试mysql数据库插入功能的");
		iu.getUserInfo();
	}
}

