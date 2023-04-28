package reviewClass8;

public abstract class AbstractDemo {
     String userName;
    public static int id=1;
    String  password;
    double balance;

    void getInfo(String username, String password){
        this.userName=username;
        this.password=password;
    }
    public void printInfo(String userName, String password){
        if (this.userName.equals(userName) && this.password.equals(password)){
            System.out.println("this is you user name "+ userName+ " and this is your password "+password);
        }else{

            System.out.println("please provide correct user and password");
        }
    }
    abstract void balance(double balance);
}

class DemoChild extends AbstractDemo{

    void balance(double balance){
        this.balance=balance;
        System.out.println("your balance is "+ balance);
    }
}
