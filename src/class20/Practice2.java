package class20;

import reviewClass6.Students;

public class Practice2 {

    /*Write a java program of Class Students that takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.*/

    String name;
    int sub1;
    int sub2;
    int sub3;
    int grade;
    Practice2(String name1, int subject1, int subject2, int subject3){
        name=name1;
        sub1=subject1;
        sub2=subject2;
        sub3=subject3;
    }
 int averageGrade(){
        grade=(sub1+sub2+sub3)/3;
        System.out.println("name "+name+" grade "+grade);
     return grade;
 }

}
