package class17;

public class Practice {


    // aba true
    //sbd  false

    boolean isMirror(String str){

        String newStr="";
        for (int i=str.length()-1; i>=0; i-- ){
           // System.out.println(i+" "+str.charAt(i));
            newStr+=str.charAt(i);
        }
        System.out.println(newStr);
        if (newStr.equals(str)){
            return true;
        }else{
            return false;
        }
    }
}
