package class21.demo3;

public class Employee extends Person {


    double workHours;

    void work(double workHours){
        this.workHours=workHours;
        System.out.println(name+ " is working for "+workHours);
    }
}
