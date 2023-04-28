package class27;

public interface Person {

    void sleep();
    void eat();
    void study();
}

interface Employee{
    void work();
}

interface JoinCoreEmployee extends Person, Employee{
    void teach();
}

class Emp implements JoinCoreEmployee{
    public void sleep(){
        System.out.println("Joincore employee also sleep");
    }
    public void  eat(){
        System.out.println("joincore employee eat");
    }

    public void study(){
        System.out.println("join core employee study");
    }

    @Override
    public void work() {
        System.out.println("joincore employee work");
    }

    @Override
    public void teach() {
        System.out.println("joincore employee teach");
    }
}
