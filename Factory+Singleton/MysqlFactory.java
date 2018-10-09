/**
 * Mysql数据库的工厂
 * 这个工厂需要设计成单例模式
 */

public class MysqlFactory implements DataBaseFactory{
	//prevents instantiation
	private MysqlFactory()
	{
	}
	
	private static volatile MysqlFactory mysqlFactory;
	
	public static MysqlFactory createInstance(){
		if(mysqlFactory ==null){
			synchronized (MysqlFactory.class){
				if(mysqlFactory == null)
				{
					mysqlFactory = new MysqlFactory();
				}
			}
		}
		return mysqlFactory;
	}
	
	public void introduce()
	{
		System.out.println("Mysql是一款免费的数据库");
	}
	//实现父类获取数据库的方法
	public IDataBase getDataBase()
	{
		return new MysqlDataBase();
	}

}
