package day01_driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","setupFiles/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.testotomasyonu.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.bestbuy.com");
        Thread.sleep(2000);

        //back to testotomasyonu page
        driver.navigate().back();
        Thread.sleep(2000);

        // again to bestbuy
        driver.navigate().forward();
        Thread.sleep(2000);


        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.quit();

    }
}
