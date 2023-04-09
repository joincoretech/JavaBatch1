package reviewClass5;

public class AccountTesterOrBankApp {
    public static void main(String[] args) {
        Account arshadAccount=new Account();
        arshadAccount.accountNumber="A123";
        arshadAccount.userName="Arshad";
        arshadAccount.password= "pass123";
        arshadAccount.balance= 100000;

        arshadAccount.logIn("Arshad", "pass123");
        arshadAccount.userInfo();

    }
}
