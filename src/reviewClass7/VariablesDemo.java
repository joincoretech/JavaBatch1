package reviewClass7;

public class VariablesDemo {

    int num=10;
    String name="Noorullah";
    static String str="every one like to have today off";

    public void nonStaticMethod(){
        System.out.println(num);
        System.out.println(str);
    }

    public static void staticMethod(){
        System.out.println(str);
        VariablesDemo variablesDemo=new VariablesDemo();
        System.out.println(variablesDemo.name);
    }

    void localMethod(String inf){
        String name=" this is your info ";
        System.out.println(name +inf);
    }

    public static void main(String[] args) {
        staticMethod();
        VariablesDemo obj=new VariablesDemo();
        obj.localMethod("Arif");
        obj.nonStaticMethod();
    }

}
