package class19;

public class InstanceVariables {

    String name="Khushal";
    int age = 19;

    public void info(){
      InstanceVariables obj= new InstanceVariables();
        System.out.println(obj.age);
        System.out.println(obj.name);
        String cell="200100300";
        System.out.println(cell);
    }

    public static void main(String[] args) {
        InstanceVariables obj=new InstanceVariables();
        obj.info();//
    }

}
