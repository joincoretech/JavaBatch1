package class15;

public class DogsTester {

    public static void main(String[] args) {

        Dogs bullDog = new Dogs();

        bullDog.breed="American BullDog";
        bullDog.color= "yellow";
        bullDog.size= "large";
        bullDog.age="5";
        bullDog.look();
        bullDog.eat();
        bullDog.bark();
        bullDog.sleep();


        Dogs grandHunt= new Dogs();

        grandHunt.breed="Afghan grand hunt";
        grandHunt.size= "tall";
        grandHunt.color="white";
        grandHunt.age= "10";
        grandHunt.look();
    }
}
