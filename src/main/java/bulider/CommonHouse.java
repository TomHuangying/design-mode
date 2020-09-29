package bulider;

public class CommonHouse extends AbstractHouse{


    @Override
    public void buildBasic() {
        System.out.println("打地基");
    }

    @Override
    public void builderWalls() {
        System.out.println("砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("封顶");
    }

}
