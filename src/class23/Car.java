package class23;

public class Car {

    void start(){
        System.out.println("the car is starting by key");
    }
    void stop(){
        System.out.println("you should use brake to stop the car");
    }
}

class BMW extends Car{
     void start(){
         System.out.println("Use the button to start the car");
     }

}

class Tesla extends Car{

    void start(){
        System.out.println("Start the car with finger print button");
    }
    void stop(){
        System.out.println("stop the carr with sensor");
    }
}