import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Zuhra");
        driver.findElement(By.name("lastname")).sendKeys("Nabi");
        driver.findElement(By.name("reg_email__")).sendKeys("email@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("email@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Password123");
        driver.findElement(By.name("birthday_month")).sendKeys("Mar");
        driver.findElement(By.name("birthday_day")).sendKeys("19");
        driver.findElement(By.name("birthday_year")).sendKeys("1999");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.close();
        driver.quit();
    }
}
