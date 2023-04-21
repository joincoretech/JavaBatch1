package reviewClass7;

public class OverLoadingDemo {

    OverLoadingDemo(){
        System.out.println("I am constructor with out parameter");
    }
    OverLoadingDemo(String name){
         System.out.println("Hello i am the parameter constructor "+name);
    }

     void printInfo(){
        System.out.println("this is your info");
    }

   public void printInfo(String name){
        System.out.println("Hell this is your info "+name);
    }

    static void staticMethod(){
        System.out.println("Hello i am the static method");
    }

   static void staticMethod(String name){
        System.out.println("Hello i am the static with parameter "+name);
    }

    public static void main(String[] args) {
        OverLoadingDemo obj=new OverLoadingDemo();
        obj.printInfo();
        obj.printInfo("Noor");

        OverLoadingDemo obj1=new OverLoadingDemo("Arif");
    }
}
