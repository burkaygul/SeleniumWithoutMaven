package day01_driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_FirstTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","setupFiles/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getTitle());

        String expectedTitle = "Test Otomasyonu";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title test PASSED");
        } else System.out.println("Title test FAILED");

        System.out.println(driver.getCurrentUrl());

        String expectedUrl = "https://www.testotomasyonu.com/";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url equals PASSED");
        }else System.out.println("Url equals FAILED");

        System.out.println(driver.getWindowHandle());

        String expectedPageSource = "otomasyon";
        String actualPageSource = driver.getPageSource();

        if (actualPageSource.contains(expectedPageSource)){
            System.out.println("Url Page Source PASSED");
        } else System.out.println("Url Page Source FAILED");

        driver.close();

    }
}
