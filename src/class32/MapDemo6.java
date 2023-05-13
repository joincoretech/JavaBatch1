package class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo6 {
    public static void main(String[] args) {

        Map<String, Double>  fruits=new TreeMap<>();
        fruits.put("Apples", 1.5);
        fruits.put("Apricot", 2.00 );
        fruits.put("Gripes", 1.0);
        fruits.put("Strawberry", 2.0);
        fruits.put("WaterMelon", 1.0);

        System.out.println(fruits.size());
        fruits.keySet().removeIf(key -> key.contains("p"));// short way to remove
        System.out.println(fruits.size());
       /* Iterator<String>  iterator=fruits."keySet().iterator();
        while (iterator.hasNext()){
            String key=iterator.next();
            if (key.contains("p")){
                iterator.remove();
            }
        }*/

        System.out.println(fruits);
    }
}
