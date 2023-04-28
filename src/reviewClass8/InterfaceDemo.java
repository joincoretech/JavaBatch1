package reviewClass8;

public interface InterfaceDemo {
    //int num; we can not create instance variable

    void add(int num, int num1);// java compiler add public abstract
    void sub();
    void multi();
    void div();

}
class calculator implements InterfaceDemo, Header{
     public void calTitle(){
         System.out.println("this is hard coded calculator");
     }

    public void add(int n, int n1){
         System.out.println(n+n1);
    }
    public void sub(){
         System.out.println(15-10);
    }

    public void multi(){
         System.out.println(5*5);
    }
    public void div(){
         System.out.println(10/2);
    }
}

interface Header{
    void calTitle();
}
