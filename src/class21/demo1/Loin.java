package class21.demo1;

import class21.demo1.Animal;

public class Loin extends Animal {

    Loin(String name){
        this.name=name;
    }

    void roar(){
        System.out.println(name+" is roaring");
    }
}
