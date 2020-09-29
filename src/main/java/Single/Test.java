package Single;

import org.openjdk.jol.info.ClassLayout;

public class Test {
    private static Object Test2;
    private static Object Singleton;

    public static void main(String[] args) {
        System.out.println( System.getProperties());
//        System.out.println(ClassLayout.parseInstance(Test2).toPrintable());
    }


}
