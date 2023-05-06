package class30;

import java.util.ArrayList;

public class InsuranceTester {
    public static void main(String[] args) {

        Car1 car1=new Car1("GECO","Honda");
        Pet pet=new Pet("Geco", "Dog");
        Health health=new Health("AAA");

        ArrayList<Insurance> arrayList= new ArrayList<>();
        arrayList.add(car1);
        arrayList.add(pet);
        arrayList.add(health);

        for (Insurance insurance: arrayList){
            insurance.getQuote();
            insurance.cancelInsurance();
        }
    }
}
