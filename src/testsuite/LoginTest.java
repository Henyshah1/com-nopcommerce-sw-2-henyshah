package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find the login link and click on it
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        String expectedText = "Welcome, Please Sign In!";
        //find the actual text element and get the text from element
        WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Not redirected to login page", expectedText, actualText);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Find the login link and click on it
        WebElement loginlink =  driver.findElement(By.linkText("Log in"));
        loginlink.click();
        //find the email field and type the email address to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("heny123@gmail.com");

        //find the password field and type the password to  password field
        driver.findElement(By.name("Password")).sendKeys("heny123");
        //find the login btn element and click
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        String expectedErrorMessage = "log out";
        //find the errormessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='log out']")).getText();
        Assert.assertEquals("log out", expectedErrorMessage,actualErrorMessage);

    }
    @Test
    public void verifyTheErrorMessage(){
        //Find the login link and click on it
        WebElement loginlink =  driver.findElement(By.linkText("Log in"));
        loginlink.click();

        //find the email field and type the email address to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abc123@gmail.com");

        //find the password field and type the password to  password field
        driver.findElement(By.name("Password")).sendKeys("abc123");

        //find the login btn element and click
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                " No customer account found";
        //find the errormessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not display", expectedErrorMessage,actualErrorMessage);
    }
    @After
    public void tearDown () {
        closeBrowser();

    }
}