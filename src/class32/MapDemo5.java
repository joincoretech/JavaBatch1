package class32;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {

        Map<Integer, String> students=new HashMap<>();
        students.put(001, null);
        students.put(002, "Noorullah Ahmadzai");
        students.put(003, "Arif");
        students.put(005, "Aziz");
        students.put(004,"Farhad");

        Set<Integer> keys=students.keySet();
        Iterator<Integer> it=keys.iterator();
        while (it.hasNext()){
            Integer key=it.next();
            String value= students.get(key);
            if (key == 003) {
                it.remove();
            }
            System.out.println(key+ " "+ value);
            }

        System.out.println(students);

        System.out.println("===== use for loop==================");

        for (Integer key: keys){
            String value=students.get(key);
            System.out.println(key+ " "+ value);
        }
    }
}
