package class27;

public class ClassInterfaceDemo implements I, I2 {
    public void  interfaceMethod(){
        System.out.println("this is implementation for interface method");
    }

    public static void main(String[] args) {
        ClassInterfaceDemo classInterfaceDemo=new ClassInterfaceDemo();
        classInterfaceDemo.interfaceMethod();
    }
}

interface I{
    void interfaceMethod();
}

interface   I2{

}
