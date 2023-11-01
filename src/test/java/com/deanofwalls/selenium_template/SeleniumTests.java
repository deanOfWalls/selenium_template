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

            // Navigate to the web page
            driver.get("https://automationexercise.com/signup");

            // Set an explicit wait for a specific element on the page to be visible
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn:nth-child(5)")));
            if(element.isDisplayed()){
                System.out.println("Page appears to be loaded");
            }
            else{
                System.out.println("Element wasn't found");
            }

            //input a name into the 'Name' field
            WebElement nameField = driver.findElement(By.cssSelector(".signup-form > form:nth-child(2) > input:nth-child(2)"));
            nameField.sendKeys("MyNameIsMud");

            //input an email address into the 'Email Address' field
            WebElement emailField = driver.findElement(By.cssSelector(".signup-form > form:nth-child(2) > input:nth-child(3)"));
            emailField.sendKeys("primus@sucks.com");

            //click the signup button
            WebElement signupButton  =  driver.findElement(By.cssSelector("button.btn:nth-child(5)"));
            signupButton.click();

            //wait for next page to load
            wait();

            //set password
            WebElement passwordField = driver.findElement(By.cssSelector(".signup-form > form:nth-child(2) > input:nth-child(3)"));
            passwordField.sendKeys("Abc123IThatesME");


            //set first name
            WebElement firstNameField = driver.findElement(By.cssSelector(".signup-form > form:nth-child(2) > input:nth-child(3)"));
            firstNameField.sendKeys("Aloysius");

            //set last name
            WebElement lastNameField = driver.findElement(By.cssSelector(".signup-form > form:nth-child(2) > input:nth-child(3)"));
            lastNameField.sendKeys("Abercrombie");

            //set address
            WebElement addressField = driver.findElement(By.cssSelector(".signup-form > form:nth-child(2) > input:nth-child(3)"));
            addressField.sendKeys("123 Trailer Park Ln");






//            // Find and interact with the input fields
//            WebElement firstNameInput = driver.findElement(By.id("fname"));
//            WebElement lastNameInput = driver.findElement(By.id("lname"));
//
//            firstNameInput.sendKeys("John");
//            lastNameInput.sendKeys("Doe");
//
//            // Click the "Create Person" button
//            WebElement createButton = driver.findElement(By.xpath("//button[contains(text(), 'Create Person')]"));
//            createButton.click();
//
//            // Wait for the response to load (you may need to add explicit waits)
//            Thread.sleep(2000);
//
//            // Verify the output in the "output" div
//            WebElement outputDiv = driver.findElement(By.id("output"));
//            String outputText = outputDiv.getText();
//
//            if (outputText.contains("Successfully created")) {
//                System.out.println("Test passed: Person created successfully.");
//            } else {
//                System.out.println("Test failed: Person creation failed.");
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
//        finally {
//            // Close the WebDriver
//            driver.quit();
//        }

    }
}

