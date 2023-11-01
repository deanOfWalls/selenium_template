package com.deanofwalls.selenium_template;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTests {

    @Test
    public void mySeleniumTest() {
        // Use WebDriverManager to manage FirefoxDriver
        WebDriverManager.firefoxdriver().setup();

        // Configure DesiredCapabilities to disable JavaScript errors and bypass untrusted SSL certificates
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("javascriptEnabled", true);
        capabilities.setCapability("acceptInsecureCerts", true);

        // Initialize FirefoxOptions with DesiredCapabilities
        FirefoxOptions options = new FirefoxOptions();
        options.merge(capabilities);

        // Set the preference to suppress JavaScript warnings and errors
        options.addPreference("javascript.error.console", "ignore");


        // Initialize the WebDriver with FirefoxOptions
        WebDriver driver = new FirefoxDriver(options);

        try {
            // Your test code here
            // ...
            driver.get("https://*");

        } catch (Exception e) {
            e.printStackTrace();
        }
//        finally {
//            // Close the WebDriver
//            driver.quit();
//        }
    }
}
