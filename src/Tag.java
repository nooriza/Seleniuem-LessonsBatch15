import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tag {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com/");
        //get all the links
        //we know tha tll links are in tag <a> which is called anchor tag
        //let's use the locator by TagName for this purpose
        List<WebElement> tags=driver.findElements(By.tagName("a"));
        for(WebElement tag:tags){
            tag.getAttribute("href");
            String link = tag.getAttribute("href");
            System.out.println(link);
        }
    }
}
