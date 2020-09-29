package factory.pizzastore.factorymethod.pizza;

public abstract class Pizza {

    protected String name;//名字
    //    准备原材料，不同的披萨不一样，因此我们做成一个抽象方法
    public abstract  void prepare();
    public void setName(String name){
        this.name = name;
//        System.out.println(name);
    }
    public String getName() {
        return name;
    }
    public void bake(){
        System.out.println(getName()+" baking");
    }
    public void cut(){
        System.out.println(getName()+" cut");
    }
    //    打包
    public void box(){
        System.out.println(getName()+" box");
    }


}
