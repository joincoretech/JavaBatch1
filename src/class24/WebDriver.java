package class24;

public class WebDriver {

    void openWebSite(){
        System.out.println("Opening the website");
    }
    void closingWebsite(){
        System.out.println("close the website");
    }
    void loginWebsite(){
        System.out.println("logging in the website");
    }
}

class GoogleChrome extends WebDriver{
    void openWebSite(){
        System.out.println("Opening the website in the google chrome");
    }
    void closingWebsite(){
        System.out.println("close the website google chrome");
    }
    void loginWebsite(){
        System.out.println("logging in the website google chrome");
    }
}

class FirFox extends WebDriver{
    void openWebSite(){
        System.out.println("Opening the website in the firefox");
    }
    void closingWebsite(){
        System.out.println("close the website in the firefox");
    }
    void loginWebsite(){
        System.out.println("logging in the website in the firefox");
    }
}