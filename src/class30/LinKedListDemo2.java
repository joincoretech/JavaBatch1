package class30;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinKedListDemo2 {
    public static void main(String[] args) {
        List<String> linkedList=new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add("strawberry");
        linkedList.add("Watermelon");
        linkedList.add("Pineapple");

        Iterator<String> iterator=linkedList.iterator();
        while (iterator.hasNext()){
          String var= iterator.next();
          System.out.println(var);
        }
    }
}
