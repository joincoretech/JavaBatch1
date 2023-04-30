package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList <String> arrayList=new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("Orange");
        arrayList.add("Banana");
        arrayList.add("Grapes");
        arrayList.add("watermelon");

        System.out.println("this is enhanced for loop data");
        for (String array: arrayList){
            System.out.println(array);
        }

        System.out.println("this is regular for loop data");
        for (int i=0; i<=arrayList.size()-1; i++){

            System.out.println(arrayList.get(i));
        }

        System.out.println("this is iterator looping data");
        Iterator <String> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            if (str.length()>5){
                iterator.remove();
            }
            System.out.println(str);
        }
        System.out.println(arrayList);

    }
}
