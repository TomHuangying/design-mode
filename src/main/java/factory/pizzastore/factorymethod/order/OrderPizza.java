package factory.pizzastore.factorymethod.order;

import factory.pizzastore.factorymethod.pizza.Pizza;
import factory.pizzastore.pizza.GreekPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    //    构造器
    public OrderPizza(){
        Pizza pizza = null;//初始化为空
        String orderType;//订购披萨的类型
        do{
            orderType = getType();
            if(orderType.equals("greek")){
//                pizza = new BJGreekPizza();//创建披萨
                pizza.setName("希腊披萨");
            }else if(orderType.equals("chese")){
//                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else if(orderType.equals("pepper")){
//                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            }else{
                break;
            }
//            输出pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.bake();
        }while(true);
    }
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
