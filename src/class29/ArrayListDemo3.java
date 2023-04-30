package class29;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> subjects= new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("STLC");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");

        ArrayList <String > subject2=new ArrayList<>();
        subject2.add("git");
        subject2.add("selenium");
        subject2.add("java");

        subjects.addAll(2,subject2);
        System.out.println(subjects);



    }
}
