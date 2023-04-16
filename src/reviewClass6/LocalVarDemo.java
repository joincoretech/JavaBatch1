package reviewClass6;

public class LocalVarDemo {


    public String reversString(String str){//ada 3

        String newStr="";
        for (int i=str.length()-1; i>=0; i--){

            newStr+=str.charAt(i);
        }

        if (newStr.equals(str)){
            System.out.println("the String is palindrome");
        }else {
            System.out.println("strings are not mirror");
        }

        return newStr;
    }

}

 class LocalVarDemoTester{
     public static void main(String[] args) {
         LocalVarDemo obj= new LocalVarDemo();
         System.out.println(obj.reversString("aba"));//
     }
}
