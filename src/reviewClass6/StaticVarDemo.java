package reviewClass6;

public class StaticVarDemo {

   /* Create a method that will take a string and return an array of words from that string.
    Method should be available only within same class.
    */

    private static String []  createWordArray(String  str){

        String [] array;
        array=str.split(" ");
        for (String ar:array){
            System.out.println(ar);
        }
        return array;

    }

    public static void main(String[] args) {
        String words= " this is java review class 19";
        createWordArray(words);
    }
}

 class staticVarDemoTester{
     public static void main(String[] args) {
         String greeting=" Hello my name is  aziz";
     }
}