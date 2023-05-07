package class31;

import java.util.*;

public class RemoveArrayListDupicate {
    public static void main(String[] args) {

        List <String> fruit=new ArrayList<>();
        fruit.add("apple");
        fruit.add("Orange");
        fruit.add("mango");
        fruit.add("Watermelon");
        fruit.add("fig");
        fruit.add("Gripes");
        fruit.add("apple");
        fruit.add("Orange");
        fruit.add("mango");
        fruit.add("Watermelon");
        fruit.add("fig");
        fruit.add("Gripes");
        System.out.println(fruit);

        Set <String> fruit2=new HashSet<>(fruit);
        System.out.println(fruit2);
        ArrayList <String> fruitDuplicateRemoved=new ArrayList<>(fruit2);
        System.out.println(fruitDuplicateRemoved);

        Set <String> linkedFruitSet=new LinkedHashSet<>(fruit);
        ArrayList <String> fruitDuplicateRemoved2=new ArrayList<>(linkedFruitSet);
        System.out.println(fruitDuplicateRemoved2);

        Set<String>  fruitTreeSet=new TreeSet<>(fruit);
        System.out.println(fruitTreeSet);
        ArrayList<String> fruitDuplicateRemovedSorts=new ArrayList<>(fruitTreeSet);
        System.out.println(fruitDuplicateRemovedSorts);
    }
}
