package class26;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone=new Iphone();
        iphone.displayPicture();
        iphone.unlockPhone();
        iphone.makeCalls();
        iphone.sendText();

        Samsung samsung=new Samsung();
        samsung.displayPicture();
        samsung.unlockPhone();
        samsung.makeCalls();
        samsung.sendText();

    }
}
