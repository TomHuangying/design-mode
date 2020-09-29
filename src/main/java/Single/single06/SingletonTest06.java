package Single.single06;

public class SingletonTest06 {
    public static void main(String[] args) {
//        线程不安全
         Singleton instance  =  Singleton.getInstance();
         Singleton instance2  =  Singleton.getInstance();//第二次调用的时候instance不是null，会直接返回，导致线程不安全
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

//    加入双重检查代码，解决安全问题，同时解决懒加载问题
//    同时保证懒效率
    public static synchronized Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
