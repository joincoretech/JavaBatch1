package class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
       /* Create a map of Best Buy store. Place
        item id and item n a m e into it. Example
                (7664847 = Printer, 7879885= TV etc )
● Retrieve all keys and values from a Best
        Buy map u s in g EntrySet.*/
        LinkedHashMap<Integer, String> bestBoy=new LinkedHashMap<>();
        bestBoy.put(10001, "Printer");
        bestBoy.put(10002, "Tv");
        bestBoy.put(10003, "Chairs");
        bestBoy.put(10004, "Iron");

        //Set<Map.Entry<Integer,String>> set=bestBoy.entrySet();
        for (Map.Entry<Integer, String> entry:bestBoy.entrySet()){
            System.out.println(entry.getKey()+ "  "+ entry.getValue());
        }

        Iterator <Map.Entry<Integer,String>> iterator=bestBoy.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            System.out.println(entry.getKey()+ "  "+ entry.getValue());
        }
    }
}
