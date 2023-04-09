package reviewClass4;

public class Demo1 {
    public static void main(String[] args) {

       /* Write a program that reads two people's first
        n a m e s and if they expecting boy or girl? Based
        on the input s u g ge sts a n a me for a baby:*/

        String mom="Diana";
        String dad= "Smith";
        String child="girl";

        if (child.equalsIgnoreCase("girl")){
            int middle=dad.length()/2;
            System.out.println(mom.substring(0,2)+dad.substring(middle));
        }else{
            int middle3=mom.length()/2;
            System.out.println(dad.substring(0,2)+mom.substring(middle3));

        }
    }
}
