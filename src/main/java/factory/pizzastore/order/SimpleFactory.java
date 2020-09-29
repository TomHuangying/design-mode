package factory.pizzastore.order;

import factory.pizzastore.pizza.CheesePizza;
import factory.pizzastore.pizza.GreekPizza;
import factory.pizzastore.pizza.PepperPizza;
import factory.pizzastore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {

//    根据orderType 返回对应的Pizza对象
    public  static Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();//创建披萨
            pizza.setName("希腊披萨");
        }else if(orderType.equals("chese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

//    简单工厂模式也叫 静态工厂模式
}
