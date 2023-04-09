package reviewClass4;

public class Demo2 {
    public static void main(String[] args) {


        String num="wrotirwoitoKJFKGJAKGJ5894368938@#$#%$^&^&*";

        System.out.println(num.replaceAll("[^0-9]", ""));// only number will stay

        System.out.println(num.replaceAll("[^a-zA-Z]", ""));

        String name = "Joincoretech";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());// ==
    }

}
