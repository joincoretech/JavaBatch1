package class24;

public class AnimalTester {
    public static void main(String[] args) {
        Animal cat=new Cat();// upcasting
        cat.eat();
        cat.sleep();
        Cat animal=(Cat) new Animal();
           animal.eat();
    }
}
