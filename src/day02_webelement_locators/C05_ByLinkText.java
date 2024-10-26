package day02_webelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_ByLinkText {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.automationexercise.com/");

        Thread.sleep(1000);

        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));

        int expectedLinkSayisi = 147;
        int actualLinksayisi = linkListesi.size();

        if (expectedLinkSayisi==actualLinksayisi){
            System.out.println("Link sayisi testi PASSED");
        }else System.out.println("Link sayisi testi FAILED");

        driver.findElement(By.partialLinkText("roducts")).click();

        WebElement specialyaziElementi = driver.findElement(By.id("sale_image"));

        if (specialyaziElementi.isDisplayed()){
            System.out.println("Special Offer yazi testi PASSED");
        }else System.out.println("Special Offer yazi testi FAILED");


        Thread.sleep(3000);
        driver.quit();
    }
}