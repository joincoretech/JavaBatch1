package reviewClass7;

public class OverRidingMethod {

    String name;

    void printInfo(String name){
        this.name=name;
        System.out.println("Hello this is your name "+name);
    }

    private void privateMethod(){
        System.out.println("this is private method");
    }
}

class Child extends OverRidingMethod{

   void printInfo(String name){
       this.name=name;
       System.out.println("Hello this child class info "+name);
   }

}

class Tester{
    public static void main(String[] args) {
        Child child=new Child();
           child.printInfo("Khushal");

    }
}