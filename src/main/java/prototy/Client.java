package prototy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Sheep sheep = new Sheep("sheep1",12,"red");
//        sheep.friend = new Sheep("jack",2,"black");
//
//        Sheep sheep1 = (Sheep)sheep.clone();//克隆
//        Sheep sheep2 = (Sheep)sheep.clone();//克隆
//        Sheep sheep3 = (Sheep)sheep.clone();//克隆
//        Sheep sheep4 = (Sheep)sheep.clone();//克隆
//        Sheep sheep5 = (Sheep)sheep.clone();//克隆
//
//        System.out.println("sheep2="+sheep2+"sheep2.friend="+sheep2.friend.hashCode());
//        System.out.println("sheep3="+sheep2+"sheep3.friend="+sheep2.friend.hashCode());
//        System.out.println("sheep4="+sheep2+"sheep4.friend="+sheep2.friend.hashCode());
//        System.out.println("sheep5="+sheep2+"sheep5.friend="+sheep2.friend.hashCode());

        DeepProtoType p = new DeepProtoType();
        p.name = "小明";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛","大牛的类");

//        方式一 完成深拷贝,hashCode是不一样的
//        DeepProtoType p2 = (DeepProtoType) p.clone();
//        System.out.println("p.name="+p.name+"p.deepCloneableTarget="+p.deepCloneableTarget.hashCode());
//        System.out.println("p2.name="+p.name+"p2.deepCloneableTarget="+p2.deepCloneableTarget.hashCode());

//        方式二
        DeepProtoType p2 = (DeepProtoType)p.deepClone();
        System.out.println("p.name="+p.name+"p.deepCloneableTarget="+p.deepCloneableTarget.hashCode());
        System.out.println("p2.name="+p.name+"p2.deepCloneableTarget="+p2.deepCloneableTarget.hashCode());
    }
}
