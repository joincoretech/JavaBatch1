package class28;

public class DemoTester {
    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo=new EncapsulationDemo();

        encapsulationDemo.setField(10);
        encapsulationDemo.setField1(20);
        encapsulationDemo.setField2(30);

        //int num1=encapsulationDemo.getField();
        int num2=encapsulationDemo.getField1();
        int nym3=encapsulationDemo.getField2();

         encapsulationDemo.getField();
        //System.out.println(num1);
        System.out.println(num2+10);
        System.out.println(nym3);


    }
}
