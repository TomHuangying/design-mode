package bulider.bulider;

public class HighBuilding extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("高楼地基100m");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼的强20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼透明的屋顶");
    }
}
