package class31;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet <String> names=new TreeSet<>();
        names.add("Aziz");
        names.add("Muhibullah");
        names.add("Farhad");
        names.add("Noorullah");
        names.add("Arshad");
        names.add("Khushal");
        names.add("Muzamil");
        names.add("Arif");
        for (int i=0; i<=4; i++){
            names.add(""+ i +"");
        }

        System.out.println(names);

        for (String str:names){
            System.out.println(str);
        }

        TreeSet <Integer> numbers=new TreeSet<>();
        for (int i=1; i<=50; i++){
            numbers.add(i);
        }

        System.out.println(numbers);

        /*for (Integer n:numbers){ // we will get exception error
            if (n%2!=0){
                numbers.remove(n);
            }

        }*/
        Iterator <Integer> it=numbers.iterator();
        while (it.hasNext()){
            Integer n=it.next();
            if (n%2!=0){
                it.remove();
            }
        }
        System.out.println(numbers);

        for (Integer n:numbers){
            System.out.print(n+ " ");
        }
    }
}
