/**
 *
 * 数据库工厂类
 * DataFactory 作为工厂类的接口，分别用来构造不同的实例
 *
 */
public interface DataFactory{
        //创建具体的对象
	IUser createUser();
}


