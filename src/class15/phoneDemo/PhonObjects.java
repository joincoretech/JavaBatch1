package class15.phoneDemo;

import class15.phoneDemo.MobilePhone;

public class PhonObjects {
    public static void main(String[] args) {

        MobilePhone iphone= new MobilePhone();

        iphone.model="iphone 12";
        iphone.price= 999;
        iphone.size= 6.4;
        iphone.make= "Apple";
        iphone.color="Black";
        iphone.phoneDetails();

        MobilePhone sammsung= new MobilePhone();

        sammsung.model="Glaxy 14";
        sammsung.price= 1000;
        sammsung.make= "Samsung";
        sammsung.color= "Black";
        sammsung.size= 7.4;
        sammsung.phoneDetails();

    }
}
