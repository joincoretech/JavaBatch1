package class31;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        /*Create a Set collection in which you need to add  names  of  the  countries.
        In  this  set  we want all objects to be sorted in alphabetical order.
                Using  2  different  ways  retrieve  all elements from set.*/

        Set <String> countryNames=new TreeSet<>();
        countryNames.add("USA");
        countryNames.add("Mexico");
        countryNames.add("Canada");
        countryNames.add("Brazil");

        Iterator<String> it=countryNames.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        for(String country:countryNames){
            System.out.println(country);
        }


    }
}
