package class24;

public class WebdriverTester {
    public static void main(String[] args) {
       /* WebDriver webDriver=new FirFox();

        webDriver.openWebSite();
        webDriver.closingWebsite();
        webDriver.loginWebsite();*/

        WebDriver [] webDrivers= {new FirFox(), new GoogleChrome()};

        for (WebDriver webDriver : webDrivers){
            webDriver.openWebSite();
            webDriver.loginWebsite();
            webDriver.closingWebsite();
        }

    }

}
