package class20;

public class ConstructorDemo4 {

    String name;
    double bonus;
    double salary;
    double bonusPercentage;
    int numberOfWorkDays;

    ConstructorDemo4 (String name, double salary, int numberOfWorkDays, double bonusPercentage){

        this.name=name;
        this.bonus=1000;
        this.salary=salary;
        this.numberOfWorkDays=numberOfWorkDays;
        this.bonusPercentage=bonusPercentage;

    }

    void printBonus(){
        if (numberOfWorkDays>300){
            bonus=1500;
        }else{
            bonus=500;
        }
    }

}
