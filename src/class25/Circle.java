package class25;

public class Circle  extends Shape{

    public Circle (double radius){
         super(radius);
    }

    void area(){
        System.out.println(Math.pow(radius, 2)*Math.PI);
    }

    public static void main(String[] args) {
         Circle circle=new Circle(2);
         circle.area();
         System.out.println(circle.radius);
    }
}
