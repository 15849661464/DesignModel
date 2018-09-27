/**
 * 这个是公用的数据接口  不光只有Mysql可以集成，别的数据库也可以集成这个
 * 操作表的接口 
 * 操作数据库的User表的接口
 * 
 */
public interface IUser{
	//向数据库中插入一条数据
	public void insert(String content);
	//获取数据库中的数据
	public void getUserInfo();
}

