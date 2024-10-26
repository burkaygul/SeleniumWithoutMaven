package day02_webelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C07_XPath {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com");

        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        WebElement sonucYaziElementi = driver.findElement(By.className("product-count-text"));
        System.out.println(sonucYaziElementi.getText()); // 4 Products Found



        int expectedMinSonuc = 2;
        int actualSonucSayisi = Integer.parseInt(sonucYaziElementi.getText().replaceAll("\\D",""));

        if (actualSonucSayisi>expectedMinSonuc){
            System.out.println("Bulunan urun sayisi testi PASSED");
        }else System.out.println("Bulunan urun sayisi testi FAILED");


        List<WebElement> bulunanUrunElementleriList = driver.findElements(By.xpath("//div[@class='product-box my-2  py-1']"));
        bulunanUrunElementleriList.get(1).click();

        // acilan urun sayfasinda, urun isminde
        // case sensitive olmadan phone gectigini test edin
        WebElement urunisimElementi = driver.findElement(By.xpath("//div[@class=' heading-sm mb-4']"));

        String expectedIsimIcerik = "phone";
        String actualUrunIsmiKucukHarf = urunisimElementi.getText().toLowerCase();

        if (actualUrunIsmiKucukHarf.contains(expectedIsimIcerik)){
            System.out.println("Urun isim testi PASSED");
        }else System.out.println("Urun isim testi FAILED");


        Thread.sleep(3000);
        driver.quit();
    }
}