package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchApplication {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
    }
}
