package class28;

public class Person {

    private String name;
    private String bankAccount;
    private String address;
    private String SSN;

   public void setName(String name){
        if (name.length()<15){
            this.name=name;
        }else {
            System.out.println("your name should not be more than 15 character");
        }
    }

   public void getName(){
        System.out.println(this.name);
    }


}

class PersonTester{

    public static void main(String[] args) {
        Person person=new Person();
       // person.name="Farhad";
        person.setName("Farhad");
        person.getName();
    }
}
