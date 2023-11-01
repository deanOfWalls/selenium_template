## Commonly used Selenium WebDriver syntax and actions
This guide provides a reference for commonly used Selenium WebDriver syntax and actions in Java for automating web testing.
### Locating Web Elements
* Find an element by ID:
```java
WebElement element = driver.findElement(By.id("elementId"));
```
* Find an element by name:
```java
WebElement element = driver.findElement(By.name("elementName"));
```
* Find an element by XPath
```java
WebElement element = driver.findElement(By.xpath("//xpath/expression"));
```
* Find an element by CSS selector:
```java
WebElement element = driver.findElement(By.cssSelector("css-selector"));
```
### Interacting with Web Elements
* Send keys (type text) into an input field:
```java
element.sendKeys("Text to input");
```
* Click on a button or element:
```java
element.click();
```
* Clear the content of an input field:
```java
element.clear();
```
### Assertions and Verifications
* Verify page title:
```java
String expectedTitle = "Expected Title";
String actualTitle = driver.getTitle();
assertEquals(expectedTitle, actualTitle);
```
* Assert element presence:
```java
assertTrue(element.isDisplayed());
```
* Assert element text:
```java
String expectedText = "Expected Text";
String actualText = element.getText();
assertEquals(expectedText, actualText);
```
### Waiting
* Implicit wait:
```java
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
```
* Explicit wait (using ExpectedConditions):
```java
WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("elementId")));
```
### Handling Popups and Alerts
* Switch to an alert and accept it:
```java
Alert alert = driver.switchTo().alert();
alert.accept();
```
### Navigating
* Navigate foward:
```java
driver.navigate().forward();
```
* Navigate back:
```java
driver.navigate().back();
```
* Refresh the current page:
```java
driver.navigate().refresh();
```
### Closing and Quitting WebDriver
* Close the current browser window:
```java
driver.close();
```
* Quit the WebDriver session:
```java
driver.quit();
```
_Created by deanOfWalls on 11/01/2023_