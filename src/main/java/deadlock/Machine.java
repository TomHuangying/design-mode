package deadlock;

import com.sun.source.tree.SynchronizedTree;

import java.util.Map;
import java.util.concurrent.SynchronousQueue;

public class  Machine extends Thread {
    private Counter counter;//共享数据,计数器
    public Machine (Counter counter){//构造方法，用counter，直接传入
        this.counter = counter;
        start();//开启自身线程
    }
    public void run(){
        for(int i = 0;i<100;i++){
            counter.add();
        }
    }
    public static void main(String args[]) {
        Counter counter1 = new Counter();//一个对象
        Counter counter2 = new Counter();//两个对象
        counter1.setFriend(counter2);//对象一放入对象二
        counter2.setFriend(counter1);//对象儿放入对象一

        Machine machine1 = new Machine(counter1);//启动线程一
        Machine machine2 = new Machine(counter2);//启动线程二

    }
}
class Counter{
    private int a;
    private Counter friend;
    public void setFriend(Counter friend){
        this.friend = friend;
    }

    public synchronized void add(){
        a++;
        Thread.yield();//让步
        friend.delete();
        System.out.println(Thread.currentThread().getName()+":add");
    }
    public synchronized  void delete(){
        a--;
        System.out.println(Thread.currentThread().getName()+":delete");
    }
}