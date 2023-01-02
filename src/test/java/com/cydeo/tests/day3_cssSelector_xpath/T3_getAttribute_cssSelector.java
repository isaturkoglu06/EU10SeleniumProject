package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.*;
import org.openqa.selenium.*;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        //WebElement signButton = driver.findElement(By.className("login-btn"));


        //  LOCATING THE SAME WEB ELEMENT USİNG DİFFERENT ATTRIBUTE VALUE.
        //                  tagName[attribute='value']
        //                  input[class='login-btn']
        //  LOCATED USING CLASS ATTRIBUTE
        //WebElement signButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        //  LOCATED USING TYPE ATTRIBUTE
        //WebElement signButton = driver.findElement(By.cssSelector("input[type='submit']"));
        //  LOCATED USING VALUE ATTRIBUTE
        WebElement signButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText = "Log In";
        String actualButtonText = signButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In button test verification passed!");
        }else{
            System.out.println("Log In button test verification failed!");
        }

    }

}