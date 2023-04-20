package class24;

public class Parent {

   static void staticMethod(){
      System.out.println("I am static method");
    }

    void parentMethod(){
        System.out.println("I am father of my child");
    }
}

class Child extends Parent{
    static void staticMethod(){

   }
   void parentMethod(){
       System.out.println("I am child method");
   }

    public static void main(String[] args) {
        Child child=new Child();
        child.parentMethod();
    }
}

