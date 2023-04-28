package class27;

public interface VariableAndmethodDemo {
     int num=21;  // public static final int num=21;

    public abstract void method();// public abstract void method();

    static void method2(){
        System.out.println("this is static method in the interface");
    }

    default void method3(){
        System.out.println("this is default method in the interface");
    }
}
