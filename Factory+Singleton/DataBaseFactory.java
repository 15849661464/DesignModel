/**
 * 数据库工厂的抽象类
 */
public interface DataBaseFactory{
	public void introduce();
	public IDataBase getDataBase();

}
