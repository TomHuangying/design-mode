package Single.single04;

public class SingletonTest04 {
    public static void main(String[] args) {
//        线程不安全
        Singleton instance  = Singleton.getInstance();
       Singleton instance2  = Singleton.getInstance();//第二次调用的时候instance不是null，会直接返回，导致线程不安全
        System.out.println(instance == instance2);//true,hashCode是相同的
    }
}
//    饿汉式（静态变量）
class Singleton{
    //        1.构造器私有化,外部能new
    private Singleton(){

    }
    //        2.本类内部创建对象实例
    public static Singleton instance;


    //    提供一个静态的共有方法，放使用到该方法是，才去创建instance
//    加入类一个同步的关键字，解决线程安全问题
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}