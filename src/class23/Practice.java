package class23;

public class Practice {


     void area(double length, double wide){

         if (length==wide){

             System.out.println("the square area with length "+ length+ " wide "+ wide+ " is "+ length*wide);
         }else{
             System.out.println("Rectangle are is "+length*wide);
         }

     }

     void area(double length, double wide, double hight){

         System.out.println("the box area is "+ length*wide*hight);
     }

    public static void main(String[] args) {
        Practice practice= new Practice();
        practice.area(4,4);
        practice.area(4,3);
        practice.area(4,2,5);
    }

}
