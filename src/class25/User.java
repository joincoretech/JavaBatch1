package class25;

public class User {

    /*Write program: user class	has a constructor that takes name and mobile number.
    Extend this class	by userInfo that will have user address variable.
    Print users name, mobile number and address in userDetails method. Test your code.*/
    User(String name, String MobileNumber){
        System.out.println(name + " "+ MobileNumber);
    }
}
 class UserInfo extends User{

     UserInfo(String name, String mobileNumber, String address){
         super(name, mobileNumber);
         System.out.println(address);
     }

     public static void main(String[] args) {
         UserInfo userInfo=new UserInfo("myName", "5711235432", "usa city");
     }
 }
