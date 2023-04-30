package class29;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects= new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("STLC");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");


        ArrayList <String > addAllArrayElements=new ArrayList<>();
        addAllArrayElements.addAll(subjects);
        System.out.println(addAllArrayElements);
        addAllArrayElements.removeAll(addAllArrayElements);
        System.out.println(addAllArrayElements);
    }
}
