import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
        WebDriver driver1=new FirefoxDriver();
        driver1.get("https://www.google.com/");
    }
    }