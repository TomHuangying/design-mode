package Single.single08;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instances = Singleton.INSTANCE;
        Singleton instances2 = Singleton.INSTANCE;
        System.out.println(instances == instances2);
    }

}
// 推荐使用，使用枚举实现单例模式
enum Singleton{
    INSTANCE;//属性
    public void sayOk(){
        System.out.println("ok");
    }
}
