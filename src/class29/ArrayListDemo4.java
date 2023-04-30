package class29;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> subjects= new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("STLC");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        System.out.println(subjects.contains("Java"));
        System.out.println(subjects.contains("Cucumber"));

    }
}
