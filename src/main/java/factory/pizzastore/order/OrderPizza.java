package factory.pizzastore.order;

import factory.pizzastore.pizza.CheesePizza;
import factory.pizzastore.pizza.GreekPizza;
import factory.pizzastore.pizza.PepperPizza;
import factory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class OrderPizza {

////    构造器
//    public OrderPizza(){
//        Pizza pizza = null;//初始化为空
//        String orderType;//订购披萨的类型
//        do{
//            orderType = getType();
//            if(orderType.equals("greek")){
//                pizza = new GreekPizza();//创建披萨
//                pizza.setName("希腊披萨");
//            }else if(orderType.equals("chese")){
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            }else if(orderType.equals("pepper")){
//                pizza = new PepperPizza();
//                pizza.setName("胡椒披萨");
//            }else{
//                break;
//            }
////            输出pizza 制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.bake();
//        }while(true);
//    }

//    定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

//    构造器
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }
    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";//用户输入

        this.simpleFactory = simpleFactory;//设置简单工厂对象

        do{
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);//创建披萨，order是用户输入，在工厂类里面比较是否有这个披萨

//            输出披萨信息
            if(pizza != null){//订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            }else{
                System.out.println("订购失败");
                break;
            }
        }while(true);
    }

//    写一个方法，可以获取客户希望订购的披萨种类
    public String getType(){
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }


}
