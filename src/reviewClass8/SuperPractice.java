package reviewClass8;

public class SuperPractice {

    String name;

    public void superMethod(String name){
        this.name=name;
        System.out.println("this is your name "+name);
    }
    SuperPractice(){
        System.out.println("this is super class");
    }
}

class practiceChild extends SuperPractice{
    practiceChild(){
        super();
    }
    String name;

    void Method1(String name){
        this.name=name;
        super.superMethod(name);
    }


}
