import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Zafar");
        driver.findElement(By.id("customer.lastName")).sendKeys("Noori");
        driver.findElement(By.id("customer.address.street")).sendKeys("25452 Center Street");
        driver.findElement(By.name("customer.address.city")).sendKeys("Chantilly");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20152");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("9998042571");
        driver.findElement(By.id("customer.ssn")).sendKeys("000-00-0000");
        driver.findElement(By.name("customer.username")).sendKeys("nooriza");
        driver.findElement(By.id("customer.password")).sendKeys("Password123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Password123");
        Thread.sleep(3000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        //close the current tab
        driver.close();


    }
}
