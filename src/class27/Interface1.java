package class27;

public interface Interface1 {
    String name="Aziz";// java compiler will add public static final to the variable
    void interfaceMethod();
}

interface interface2{

    void interfaceMethod();
}

 class Child implements interface2, Interface1{

    public void interfaceMethod(){
        System.out.println("this is same method for all interfaces");
        System.out.println(name);
    }
}
