package com.deanofwalls.selenium_template;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SeleniumTests {

    @Test
    public void test() {
        // Use WebDriverManager to manage ChromeDriver
        WebDriverManager.firefoxdriver().setup();

        // Initialize the WebDriver
        //phantomjs inclusive driver, supports headless
        WebDriver driver = new FirefoxDriver();

        try {

            //TESTING OCCURS HERE

        } catch (Exception e) {
            e.printStackTrace();
        }
//        finally {
//            // Close the WebDriver
//            driver.quit();
//        }

    }
}

