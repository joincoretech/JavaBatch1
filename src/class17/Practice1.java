package class17;

public class Practice1 {

    void createEmail(String firstName, String lastName){

        System.out.println(firstName+"."+lastName+"@gmail.com");
    }

    public void isPrime(int num){
        boolean prime=true;

        if (num>1) {
            for(int i=2; i<num; i++) {
                if (num%i==0) {
                    prime=false;
                    break;
                }

            }
        }else {
            prime=false;
        }

        if (prime) {
            System.out.println(num +" is a  prime number");
        }else {
            System.out.println(num +" is not a  prime number");
        }
    }

}
