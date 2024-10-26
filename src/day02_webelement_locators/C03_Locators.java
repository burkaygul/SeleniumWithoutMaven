package day02_webelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.helpers.ParserAdapter;

import java.time.Duration;

public class C03_Locators {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webrdiver.chrome.driver", "setupFiles/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");

        WebElement searchBox = driver.findElement(By.id("global-search"));

        searchBox.sendKeys("phone");
        searchBox.submit();
        Thread.sleep(3000);

        driver.close();

    }
}
