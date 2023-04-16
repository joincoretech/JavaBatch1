package class21.demo3;

public class PersonTester {

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.name="Mohibullah";
        employee.work(8);
        employee.eat();

        Student student=new Student();
        student.name="Aziz";
        student.subject="science";
        student.study();
        student.sleep();
    }
}
