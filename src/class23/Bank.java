package class23;

public class Bank {

    void transferFee(double amount){
        System.out.println("your charge fee "+amount*0.02);
    }
}

class BankOfAmerica extends Bank{

    void transferFee(double amount){
        System.out.println("BankOfAmerica charge is "+amount*0.05);
    }
}

class WellsForgo extends Bank{

    @Override
    void transferFee(double amount) {
        System.out.println("WellsForgo charge fee "+amount*0.03);
    }
}

class capitalOne extends Bank{

}