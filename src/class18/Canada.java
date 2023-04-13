package class18;

public class Canada {
    public static void main(String [] args){
        USA Obj2=new USA();
        System.out.println("Those values are from USA class to the Canda class in the same package");
        //System.out.println(capitalCity); this variable is not accessable because it is declare as private in the USA class
        System.out.println(Obj2.mainState);
        System.out.println(Obj2.school);
        System.out.println(Obj2.name);

    }
}
