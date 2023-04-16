package class20;

public class ConstructorDemo4Tester {
    public static void main(String[] args) {
        ConstructorDemo4 emp=new ConstructorDemo4("Mohibullah", 100000, 320, 10);

        emp.printBonus();
        System.out.println(emp.name);
        System.out.println(emp.salary);
        System.out.println(emp.bonus);
        System.out.println(emp.numberOfWorkDays);
        System.out.println(emp.bonusPercentage);

    }
}
