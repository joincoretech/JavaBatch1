package class32;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCommandDemo {
    public static void main(String[] args) {
        Map<String, Double> fruits=new TreeMap<>();
        fruits.put("Apples", 0.12);
        fruits.put("Apricot", 2.00 );
        fruits.put("Gripes", 1.0);
        fruits.put("Strawberry", 2.0);
        fruits.put("WaterMelon", 1.0);

        Map<String, Double> fruits2= new HashMap<>();
        fruits2.putAll(fruits);
        System.out.println(fruits2);
        System.out.println(fruits.replace("Apples", 20.0));
        System.out.println(fruits);
        System.out.println(fruits2.isEmpty());
        System.out.println(fruits.containsKey("Apples"));
    }
}
