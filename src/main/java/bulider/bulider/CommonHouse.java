package bulider.bulider;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通封顶");
    }
}
