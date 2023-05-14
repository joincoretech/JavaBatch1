package class33;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
      /*  1. Create a m a p of a building. Store floor
        number and it is associated company
        name. (Example: 1= Google,
                2=joincoretech etc..). Insert 7 entries
        with duplicate keys and values.
● Check how many entries you have?
● Update company on a 4th floor
● Remove company on the 7th floor
● Print your map*/

       Map<Integer, String> building=new HashMap<>();
       building.put(1, "Google");
       building.put(2, "Goggle");
       building.put(3, "Kh-LLC");
       building.put(4, "Microsoft");
       building.put(5, "JoinCoreTech");
       building.put(5, "apple");
       building.put(5, "JoinCoreTech");
       building.put(10, "Amazon");

       System.out.println(building);
       System.out.println(building.size());
       building.replace(4, "Microsoft1");
       System.out.println(building);
       building.put(12, "NtFlex");
        System.out.println(building);
        building.remove(12);
        System.out.println(building);


    }
}
