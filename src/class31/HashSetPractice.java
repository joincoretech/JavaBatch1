package class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {

        Set <String> hSet=new HashSet<>();
        hSet.add("apple");
        hSet.add("Orange");
        hSet.add("mango");
        hSet.add("Watermelon");
        hSet.add("Grapes");
        hSet.add(null);
        hSet.add("apple");

        System.out.println(hSet);
        hSet.remove("apple");
        System.out.println(hSet);

        for(String str:hSet){
            System.out.println(str);
        }

        Iterator <String> it=hSet.iterator();
        while (it.hasNext()){
            String str=it.next();

            System.out.println(str);
        }

    }
}
