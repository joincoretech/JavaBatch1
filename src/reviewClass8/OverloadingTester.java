package reviewClass8;

public class OverloadingTester {
    public static void main(String[] args) {
        OverloadingDemo overloadingDemo=new OverloadingDemo();
        OverloadingDemo add=new OverloadingDemo(12,12);
        add.add(13,10);
        add.add(12,12,12);
    }
}
