package bulider;

public abstract class AbstractHouse {

//    打地基
    public abstract void buildBasic();
//    砌墙
    public abstract void builderWalls();
//    封顶
    public abstract void roofed();

    public void build(){
        buildBasic();
        builderWalls();
        roofed();
    }
}
