package class29;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {

        String [] names=new String[2];
        names[0]="Muhibullah";
        names[1]="Farhad";
       // names[3]="Khushal";

        String [] names2=new String[3];
        names2[0]=names[0];
        names2[1]=names[1];
        names2[2]="Khushal";
        System.out.println(Arrays.toString(names2));

        int [] array={10,15,5,2};
        System.out.println(Arrays.stream(array).sum());
    }
}
