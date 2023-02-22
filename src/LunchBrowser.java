import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        //tell your project where the web driver is located:

        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        //System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
        //WebDriver driver1=new FirefoxDriver();
        //driver1.get("https://www.google.com/");

        String URL=driver.getCurrentUrl();
        System.out.println(URL);
        String title =driver.getTitle();
        System.out.println("the title of the page is"+title);
        Thread.sleep(6000);
        driver.quit();

    }
}
