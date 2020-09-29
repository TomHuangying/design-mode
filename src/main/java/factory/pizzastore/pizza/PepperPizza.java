package factory.pizzastore.pizza;

public class PepperPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("胡椒披萨");
    }
}
