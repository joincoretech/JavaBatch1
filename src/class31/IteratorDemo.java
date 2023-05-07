package class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorDemo {
    public static void main(String[] args) {

        Set <String>  countries=new HashSet<>();
        countries.add("USA");
        countries.add("Afghanistan");
        countries.add("Canada");
        countries.add("India");
        countries.add("Germany");

        System.out.println(countries);
        countries.remove("Canada");


        for (String country: countries){
           /* if (country.equals("USA")){
                System.out.println(country);
            }*/
            System.out.print(country+" ");
        }

        System.out.println();
        Iterator<String> iterator=countries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(countries.isEmpty());//false
        System.out.println(countries.size());//4
        countries.clear();
        System.out.println(countries.size());//0
        System.out.println(countries.isEmpty());//true
        System.out.println(countries);
    }
}
