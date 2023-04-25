package class25;

public class FinalMethods {

    final public void printInfo(){

        System.out.println("I am a final method");
    }
     void info(){
        System.out.println("I am not final method");
    }
}
class Child extends FinalMethods{

  /* public void printInfo(){ // we can not override the final method

    }*/
    void info(){
        super.info();
        System.out.println("I am child class method");
    }

    public static void main(String[] args) {
        FinalMethods obj=new Child();
        obj.info();
        obj.printInfo();
    }
}