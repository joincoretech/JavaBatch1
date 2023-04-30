package class29;


import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList  <String> names= new ArrayList<>();

        names.add("Khushal");
        names.add("Farhad");
        names.add("Muhibullah");
        names.add("Noorullah");
        names.add("Arif");

        System.out.println(names);

        for (String name:names){
            System.out.println(name);
        }
        names.add("aziz");
        System.out.println(names);
        names.remove("Arif");
        System.out.println(names);
        names.add(2, "Arif");
        System.out.println(names);

    }
}
