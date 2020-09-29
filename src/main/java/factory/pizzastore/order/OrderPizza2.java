package factory.pizzastore.order;

import factory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza2 {
    Pizza pizza= null;
    String orderType = "";
    public OrderPizza2(){
        do{
            orderType = getType();
            pizza = SimpleFactory.createPizza(orderType);

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
