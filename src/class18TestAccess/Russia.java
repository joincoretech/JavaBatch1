package class18TestAccess;


import class18.USA;

public class Russia extends USA {
    public static void main(String [] args){
        USA Obj4=new USA();
        System.out.println(Obj4.school);
        System.out.println(Obj4.mainState);
       //System.out.println(Obj4.capitalCity); Not accessable
        //System.out.println(Obj4.name); Not accessable
    }
}
