package class21.demo1;

import class21.demo1.Animal;

public class Dog extends Animal {


    Dog(String name){
        this.name=name;
    }

    void bark(){
        System.out.println(name+" is barking");
    }
    void run(){
        System.out.println(name+ " is running");
    }


}
