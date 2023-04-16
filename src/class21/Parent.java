package class21;

public class Parent {

    private String name;
    private String age;
    private String password;

    public  void getName(String name, String age, String password){
        this.age=age;
        this.name=name;
        this.password=password;
        System.out.println("name "+name+" Age "+age+ " Password "+password);
    }
}
