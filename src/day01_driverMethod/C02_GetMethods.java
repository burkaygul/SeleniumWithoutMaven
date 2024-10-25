package day01_driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_GetMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "setupFiles/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
        System.out.println(driver.getPageSource());


        Thread.sleep(5000);

        driver.quit();

    }
}
