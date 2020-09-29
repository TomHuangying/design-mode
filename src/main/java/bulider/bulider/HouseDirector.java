package bulider.bulider;

public class HouseDirector {
    HouseBuilder houseBuilder = null;

//    构造器传入houseBuilder

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

//    通过setter方法传入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
//    如何处理建造房子的流程，交给指挥者
        public House constructHouse(){
            houseBuilder.buildBasic();
            houseBuilder.buildWalls();
            houseBuilder.roofed();
            return houseBuilder.buildHouse();//buildHouse()返回房子
        }
}
