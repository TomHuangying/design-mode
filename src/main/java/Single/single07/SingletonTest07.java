package Single.single07;

public class SingletonTest07 {

}
class Singleton{
    //        1.构造器私有化
    private Singleton(){
    }
    //        2.本类内部创建对象实例
    public static Singleton instance;
//写一个静态内部类，该类中又一个静态属性Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
//提供一个共有的静态方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}









