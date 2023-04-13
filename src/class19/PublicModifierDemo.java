package class19;

public class PublicModifierDemo {

   // i can access the var in the same class in same package
   public String name ="aziz";
   public int  age = 21;
   public static  String grade="A";
    // String, int ... or type of varaible.
    // name and age are identifiers or name of variable.
    // = is assigning operators
    //  aziz or 21 are value of varaible

    public void info(int num){
        System.out.println(name);
        System.out.println(age);
        grade="B";
        System.out.println(grade);

    }

    public static void staticInfo(){
        PublicModifierDemo publicModifierDemo= new PublicModifierDemo();
        publicModifierDemo.age=23;
        System.out.println(grade);
    }

    public static void main(String[] args) {
        staticInfo();
        PublicModifierDemo publicModifierDemo=new PublicModifierDemo();
        publicModifierDemo.info(1);

    }




}
