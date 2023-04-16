package class21.demo1;

import class21.demo1.Animal;

public class Cat extends Animal {

    Cat (String name){
        this.name= name;
    }

    void meow(){
        System.out.println(name+ " is meoing");
    }

    void hunt(){
        System.out.println(name+" is mouse hunter");
    }
}
