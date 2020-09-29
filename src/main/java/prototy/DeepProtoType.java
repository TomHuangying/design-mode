package prototy;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable{
    public String name;
    public DeepCloneableTarget deepCloneableTarget;//引用类型的属性

    public DeepProtoType() {
        super();
    }

//    深拷贝-->方式一，使用克隆的方法clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
//          完成对基本数据类型和字符串的一个克隆
        deep = super.clone();
//        对引用类型的属性，进行单独的处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
//                                                              通过调用本类的clone方法实现
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();
        return deepProtoType;
    }

//  深拷贝-->方式二 通过对象的序列化实现深拷贝(推荐)
    public Object deepClone(){
//        创建一些引用对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try{
//            序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//当前这个对象以对象流的方式输出,序列化，把对象传换成字节序列

//            反序列化,字节序列传换成对象
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
//            先序列化，在反序列化，拿到对象
            DeepProtoType  copy = (DeepProtoType)ois.readObject();

            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
//            关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
