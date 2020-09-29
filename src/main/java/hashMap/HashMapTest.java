package hashMap;

import java.util.HashMap;
import java.util.LinkedList;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("huangying1","huangying1");
        hashMap.put("huangying2","huangying2");
        hashMap.put("huangying3","huangying3");
        hashMap.put("huangying4","huangying4");
        hashMap.put("huangying5","huangying5");
        System.out.println("huangying");


        for(String key:hashMap.keySet()){
            int hashcode = key.hashCode();
            int index = hashcode%8;
            System.out.println(key+": "+hashcode+"index是"+index);
//            对8进行取余
        }
    }
}
