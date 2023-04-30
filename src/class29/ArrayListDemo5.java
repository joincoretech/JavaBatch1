package class29;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String> subjects= new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("STLC");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");

        ArrayList <String> allSubjects=new ArrayList<>();
        allSubjects.add("SDLC");
        allSubjects.add("STLC");
        allSubjects.add("Java");
        allSubjects.add("Git");
        allSubjects.add("Selenium");

        System.out.println(subjects.containsAll(allSubjects));
        System.out.println(allSubjects.size());// this will give the arraylist length or size

        for (String str:allSubjects ){
            System.out.println(str +" length is "+str.length());
        }


    }
}
