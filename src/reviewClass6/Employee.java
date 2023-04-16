package reviewClass6;

public class Employee {

    // create class employee
   /* Create three	variables	eID , salary and set the manager to “Ehsan”
    Create two objects of the class Employee
Set the value of eID, salary for each of the objects
    Print out the eID , salary and	CEO for each of the objects*/

     int eID;
     int salary;
     String manager="Ehsan";

    public static void main(String[] args) {

        Employee Aziz=new Employee();
        Aziz.eID=1;
        Aziz.salary=10000;
        System.out.println("Id number "+ Aziz.eID+ " salary "+Aziz.salary+ " manager "+Aziz.manager);

        Employee khushal= new Employee();
        khushal.eID=2;
        khushal.salary=10000;
        System.out.println("ID number "+khushal.eID+ "salary "+ khushal.salary+ " manager "+khushal.manager);

    }

}
