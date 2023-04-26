package class26;

 abstract public class AbstractClass1 {

    abstract void sendText();
    void printInfi(){
       System.out.println("this is not abstract method");
    }
}

class AbstractChild extends AbstractClass1{

     void sendText(){
         System.out.println("this is abstract method implementation");
     }

    public static void main(String[] args) {
        AbstractChild obj=new AbstractChild();
        obj.sendText();
        obj.printInfi();
    }
}

