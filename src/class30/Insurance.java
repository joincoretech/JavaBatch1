package class30;

import class23.Car;

public abstract class Insurance {

   /* Create	a	class	Insurance	that	will	have	an
            attribute as insuranceName and unimplemented
            behaviour  as  getQuote  and  cancelInsurance. Create 3 subclasses Car, Pet, Health.
    class23.Car class has it’s own attribute as carModel and Class Pet has petType  attribute.
        Create  3  objects  of  the  sub classes  and  store  them  in  ArrayList.
    Using  for loop/advanced  for  loop/  iterator  access  all methods of the class.*/
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public abstract void getQuote();
    public abstract void cancelInsurance();
}

class Car1 extends Insurance {
    String carModel;
    Car1(String insuranceName, String carModel){
        super(insuranceName);
        this.carModel=carModel;
    }
    public void getQuote(){
        System.out.println("Get a quote for your car model "+ carModel+ " with "+ insuranceName);
    }

    public void cancelInsurance(){
        System.out.println("Cancel your car insurance "+ insuranceName+ " car model "+ carModel);
    }
}

class Pet extends Insurance{
     String petType;
     Pet(String insuranceName, String petType){
         super(insuranceName);
         this.petType=petType;
     }
    public void getQuote(){
        System.out.println("Get a quote for your pet "+ petType+ " with "+ insuranceName);
    }

    public void cancelInsurance(){
        System.out.println("Cancel your pet insurance "+ insuranceName+ " pet "+ petType);
    }

}

class Health extends Insurance{
    String health;
    Health(String insuranceName){
       super(insuranceName);
    }

    public void getQuote(){
        System.out.println("Get a quote for your health "+ health+ " with "+ insuranceName);
    }

    public void cancelInsurance(){
        System.out.println("Cancel your health insurance "+ insuranceName+ " health "+ health);
    }
}