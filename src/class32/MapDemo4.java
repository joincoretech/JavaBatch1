package class32;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {

        Map<String, Double> groceries= new LinkedHashMap<>();
        groceries.put("WaterMelon", 6.99);
        groceries.put("Milk", 3.9);
        groceries.put("eggs", 2.99);
        groceries.put("Tomato", 3.55);
        System.out.println(groceries);

        Set<Map.Entry<String, Double>> entrySet=groceries.entrySet();
        for (Map.Entry<String, Double> entry:entrySet ){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }

        System.out.println("================================");
        // if you want to get only key or value
        Set<String> keys=groceries.keySet();
        for(String key:keys){
            System.out.println(key+ "" +groceries.get(key));
        }
    }
}
