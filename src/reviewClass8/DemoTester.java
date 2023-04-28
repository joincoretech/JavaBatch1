package reviewClass8;

public class DemoTester {
    public static void main(String[] args) {
        DemoChild demoChild=new DemoChild();
        demoChild.getInfo("user123","user123");
        // demoChild.userName="aziz123";
       // demoChild.password="pass123";
        demoChild.printInfo("user123", "user123");
        demoChild.balance(1000);

    }
}
