package day01_driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_FirstAutomation {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","setupFiles/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        Thread.sleep(5000);

        driver.quit();


    }
}
