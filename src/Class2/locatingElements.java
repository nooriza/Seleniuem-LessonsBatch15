package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("Zafar.noori@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Qandulkhan");
       // driver.findElement(By.linkText("Create new account")).click();
        driver. findElement(By.partialLinkText("password?")).click();
    }
}
