package com.syntax.groupproroject2.t10drivers;

public class DriverMain {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.open();
        chromeDriver.close();
        chromeDriver.getTittle();
        chromeDriver.navigate();
        chromeDriver.getScreenShot();


        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.open();
        firefoxDriver.close();
        firefoxDriver.getTittle();
        firefoxDriver.navigate();
        firefoxDriver.getScreenShot();

        SafariDriver safariDriver =new SafariDriver();
        safariDriver.open();
        safariDriver.close();
        safariDriver.getTittle();
        safariDriver.getTittle();
        safariDriver.navigate();
        safariDriver.getScreenShot();
    }
}
