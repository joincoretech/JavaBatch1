package class26;

public class VehicleTester {

    public static void main(String[] args) {
        BMW bmw=new BMW("123AM", "Sadden", "X5" );
        bmw.drive();
        bmw.start();
        bmw.totalVehicleCreated();
        bmw.display();

        Toyota toyota=new Toyota("SUV", "RV4","4321T");
        toyota.display();
        toyota.start();
         Vehicle [] vehicles={new BMW("123AM", "Sadden", "X5" ),
                 new Toyota("SUV", "RV4","4321T")};
          getAllCars(vehicles);

    }

    public static void getAllCars(Vehicle []  vehicles){
         for (Vehicle v: vehicles){
             v.start();
             v.drive();
             v.stop();
             v.totalVehicleCreated();
         }
    }
}
