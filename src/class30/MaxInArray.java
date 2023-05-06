package class30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxInArray {
    public static void main(String[] args) {

        int [] array={12,10,5,100,96,77,88};

        ArrayList <Integer> arrayList=new ArrayList<>();

        for (Integer num: array){
            arrayList.add(num);
        }
        System.out.println(Collections.max(arrayList));

    }
}
