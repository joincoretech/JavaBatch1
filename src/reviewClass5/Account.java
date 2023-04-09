package reviewClass5;

public class Account {

       String userName;
       String password;
       double balance;
       String accountNumber;
       boolean isLoggedIn;

       public void logIn(String userLoggedInUserNme, String userLoggedInPassword){
            if (userName.equals(userLoggedInUserNme) && password.equals(userLoggedInPassword)){

                System.out.println("Welcome to Bank of america");
                isLoggedIn=true;
            } else {
                //System.out.println("your password or user is incorrect");
            }
       }

public void userInfo(){
           if (isLoggedIn){
               System.out.println("Your account number is "+accountNumber+" and your balance is "+balance);
           }else{
               System.out.println("your credentials are incorrect try again");
           }

}

}
