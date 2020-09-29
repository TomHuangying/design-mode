package bulider.bulider;

public class Client {
    public static void main(String[] args) {
//        该普通房子
        CommonHouse commonHouse = new CommonHouse();
//        准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);//构造方法传入
//        完成盖房子，返回产品(房子)
        House house = houseDirector.constructHouse();
        System.out.println("输出流程");
        System.out.println();
//        该高楼
        HighBuilding highBuilding= new HighBuilding();
//        重置建造这
        houseDirector.setHouseBuilder(highBuilding);//set方法传入
//        完成盖房子，返回产品(高楼)
        houseDirector.constructHouse();
    }
}
