package prototy;

import java.io.Serializable;
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;
    private String cloneNmae;
    private String cloneClass;

//    构造器，传参数
    public DeepCloneableTarget(String cloneNmae, String cloneClass) {
        this.cloneNmae = cloneNmae;
        this.cloneClass = cloneClass;
    }

//    默认的克隆方法，对基本的数据类型和方法进行克隆
//    该类的属性都是String，因此我们这里使用的是默认的克隆方式就可以
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
