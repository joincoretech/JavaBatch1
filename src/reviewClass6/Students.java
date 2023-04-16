package reviewClass6;

import java.util.Set;

public class Students {
    /*create a class students
    Create three	variables studentName , studentID	and numberOfStudents
    Create three objects of the Students Class
    Set the value for	studentName , studentID and increment	the numberOfStudents for each object
    Print out	total number of students*/

    String studentName;
    int studentID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students st=new Students();
        st.studentID=123;
        st.studentName="Muhibullah";
        st.numberOfStudents++;

        Students st1=new Students();
        st1.studentName="Arshad";
        st1.studentID=1234;
        st1.numberOfStudents++;

        Students st2= new Students();
        st2.studentName = "Aziz";
        st2.studentID=12345;
        st2.numberOfStudents++;
        System.out.println(st2.numberOfStudents);
    }
}
