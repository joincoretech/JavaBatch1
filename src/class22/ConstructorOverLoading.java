package class22;

public class ConstructorOverLoading {


    String name;
    int empID;
    double salary;
    String deportment;

    ConstructorOverLoading(String name) {
        this.name = name;
        System.out.println(name);
    }

    ConstructorOverLoading(String name, int empID) {

        this(name);
        this.empID = empID;
        System.out.println( empID);
    }

    ConstructorOverLoading(String name, int empID, double salary) {
        this(name, empID);
        this.salary = salary;
        System.out.println(salary);
    }
}