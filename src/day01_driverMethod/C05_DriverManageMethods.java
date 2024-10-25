package day01_driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverManageMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","setupFiles/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("htpps://www.testotomasyonu.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
}
