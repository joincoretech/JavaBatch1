package class28;

public class BankAccountTester {

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("Aziz","Aziz123", "pass123", 1000000);

        bankAccount.logIn("Aziz123", "pass123");

        System.out.println(bankAccount.getBalance("Aziz123", "pass123"));
    }
}
