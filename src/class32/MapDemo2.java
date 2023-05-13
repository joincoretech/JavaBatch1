package class32;

import java.util.HashMap;

public class MapDemo2 {
    public static void main(String[] args) {

        HashMap<String, Double> groceries=new HashMap<>();
        groceries.put("Eggs", 2.45);
        groceries.put("Milk", 3.5);
        groceries.put("Potato", 6.24 );
        groceries.put("Tameto", 3.5);

        System.out.println(groceries);
        System.out.println(groceries.remove("Tameto"));
        System.out.println(groceries);

    }
}
