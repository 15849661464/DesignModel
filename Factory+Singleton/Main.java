/**
 * Main方法测试 工厂模式加上单例模式
 */



public class Main{
	
	//主函数
	public static  void main(String [] args)
	{
		DataBaseFactory dbFactory = MysqlFactory.createInstance();
		IDataBase mysqlDB = dbFactory.getDataBase();
		mysqlDB.connect();
	}


}
