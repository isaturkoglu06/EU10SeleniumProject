package execute;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class wikipedia {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://tr.wikipedia.org/wiki/Anasayfa
        driver.get("https://tr.wikipedia.org/wiki/Anasayfa");

        //3- Locate burger menu
        WebElement menu = driver.findElement(By.cssSelector("label[title='Ana menü']"));

        menu.click();

        Thread.sleep(2000);

        WebElement randomPage = driver.findElement(By.cssSelector("a[accesskey='x']"));

        randomPage.click();



    }
}