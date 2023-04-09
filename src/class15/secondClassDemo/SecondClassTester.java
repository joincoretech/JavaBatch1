package class15.secondClassDemo;

import class15.secondClassDemo.SecondClass;

public class SecondClassTester {

    public static void main(String[] args) {

        SecondClass object= new SecondClass();

        object.var1="Farhad";
        object.var2= "Noorullah";

        object.method1();
        object.method2();

        SecondClass object2=new SecondClass();

         object2.var1="Aziz";
         object2.method1();

    }
}
