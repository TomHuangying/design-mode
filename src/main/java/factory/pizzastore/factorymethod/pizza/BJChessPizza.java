package factory.pizzastore.factorymethod.pizza;

public class BJChessPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪");
        System.out.println("北京的奶酪披萨");
    }
}
