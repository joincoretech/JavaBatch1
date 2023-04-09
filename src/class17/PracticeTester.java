package class17;

public class PracticeTester {

    public static void main(String[] args) {

        Practice obj= new Practice();

        System.out.println(obj.isMirror("aba"));
        System.out.println(obj.isMirror("sdbg"));


        String name ="aziz";
        StringBuilder stringBuilder=new StringBuilder(name);
        stringBuilder.reverse();
        name=stringBuilder.toString();
        System.out.println(name);// ziza

    }
}
