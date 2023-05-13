package class32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        ArrayList <String> arrayList=new ArrayList<>();
        arrayList.add("Noorullah");
        arrayList.add("Mohammad Arif");
        arrayList.add("Aziz");
        arrayList.add("Farhad");
        arrayList.add("Muzamil");
        arrayList.add("Muhibullah");
        arrayList.add("Arshad");
        System.out.println(arrayList.indexOf("Farhad"));

        Map<Integer, String> map=new HashMap<>();
        map.put(001, "Noorullah Ahmadzai");
        map.put(002,"Mohammad Arif");
        map.put(003, "Farhad");
        map.put(004, "Muzamil");
        map.put(005, "Muhibullah");
        map.put(006, "muhibullah");


        System.out.println(map);
        map.remove(006);
        System.out.println(map);


    }
}
