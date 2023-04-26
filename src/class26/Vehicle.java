package class26;

public abstract class Vehicle {

    String vin_number;
    static int totalVehicle;

    Vehicle (String vin_number){
        totalVehicle++;
        this.vin_number=vin_number;
    }
    public  void totalVehicleCreated(){
        System.out.println("we build "+totalVehicle+" Vehicles");
    }

    public void drive(){
        System.out.println("Vehicle can drive");
    }
    public void stop(){
        System.out.println("vehicle can stop");
    }
    public abstract void start();
}

class BMW extends Vehicle{
    String model;
    String make;
    BMW(String vin_number, String make, String model){
        super(vin_number);
        this.make=make;
        this.model=model;
    }
    public void start(){
        System.out.println("BMW can start with remote");
    }
    public void  speed(){
        System.out.println("BMW can go max speed 300k/h");
    }
    void display(){
        System.out.println("we build "+make+" model "+model+" "+vin_number);
    }
}

class Toyota extends Vehicle{
    String make;
    String model;
    Toyota(String make, String model, String vin_number){
        super(vin_number);
        this.make=make;
        this.model=model;
    }

    public void start(){
        System.out.println("Toyota can be start with remote or key");
    }

     void display(){
        System.out.println("we build "+make+ " model "+model+ " "+vin_number);
    }
}
