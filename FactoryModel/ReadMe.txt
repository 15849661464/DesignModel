                            这个实现的是工厂模式
            
    使用的例子是数据库更换的例子
         DataFactory: 这个是抽象工厂  只负责获取数据库对象 IUser类型的

         IUser      : 这个是对User表操作的接口

         Main       : 整个项目执行的方法
 
         MysqlFactory:这个实现了DataFactory 能获取具体的数据库对象

         MysqlUser  : 这个是mysql数据库的实现类  实现的是IUser接口中的方法
 
