package class20;

public class ConDemo2 {

    double bonus;
    double salary;
    String name;
    ConDemo2(String name){
        bonus=5000;
        salary= 50000;
        this.name=name;

    }


    public static void main(String[] args) {
        ConDemo2 obj1=new ConDemo2("Farhad");
        System.out.println("this is your bonus "+obj1.bonus);
        System.out.println("this your salary "+obj1.salary);
        System.out.println(obj1.name);

    }
}
