package class30;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo1 {
    public static void main(String[] args) {

        List <String> linkedList=new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        linkedList.add("strawberry");
        linkedList.add("Watermelon");
        linkedList.add("Pineapple");
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.indexOf("Pineapple"));

        Iterator<String> itr=linkedList.iterator();
        System.out.println(itr.hasNext());
        System.out.println(itr.next());

        itr.remove();
        System.out.println(linkedList);
        System.out.println(itr.hasNext());
        System.out.println(itr.next());


        itr.remove();
        System.out.println(linkedList);
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
    }
}
