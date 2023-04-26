package class26;

abstract public class Phone {

    void makeCalls(){
        System.out.println("calling");
    }
    void sendText(){
        System.out.println(" send text");
    }

    abstract void displayPicture();
    abstract void unlockPhone();
}

class Iphone extends Phone{

    void displayPicture(){
        System.out.println("Iphone use photo app to display pictures");
    }
    void unlockPhone(){
        System.out.println("user can unlock the iphone by faceID");
    }
}

class Samsung extends Phone{

    void displayPicture(){
        System.out.println("Samsung use gallery to display the pictures");
    }
    void unlockPhone(){
        System.out.println("Samsung use faceID and draw a code on screen to unlock the phone");
    }
}
