package class21.demo1;

public class AnimalTester {
    public static void main(String[] args) {

        Dog dog=new Dog("Max");
        dog.run();
        dog.bark();
        dog.eat();

        Cat cat=new Cat("Tom");
        cat.hunt();
        cat.meow();
        cat.sleep();

        Loin loin=new Loin("JungleKing");
        loin.roar();
        loin.eat();
        loin.sleep();
    }
}
