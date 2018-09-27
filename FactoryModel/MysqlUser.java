/**
 * Mysql 对User表的操作
 *
 *
 */
public class MysqlUser implements IUser{

	public void insert(String content)
	{
		System.out.println("向数据库中插入："+content);
	}


	public void getUserInfo()
	{
		System.out.println("Mysql 数据库已经查询到用户的数据信息了");

	}

}

