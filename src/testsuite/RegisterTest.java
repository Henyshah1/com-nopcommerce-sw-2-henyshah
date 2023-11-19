package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        WebElement Register =  driver.findElement(By.linkText("Register"));
        Register.click();
        String expectedErrorMessage = "Register";
        //find the errormessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Register ']")).getText();
        Assert.assertEquals("Register", expectedErrorMessage,actualErrorMessage);

    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        WebElement Register =  driver.findElement(By.linkText("Register"));
        Register.click();
        WebElement Gender =  driver.findElement(By.id("gender-female"));
        Gender.click();
        //find the firstname field
        WebElement firstnameField = driver.findElement(By.id("FirstName"));
        firstnameField.sendKeys("heny");
        //find the lastname field
        WebElement lastnameField = driver.findElement(By.id("LastName"));
        lastnameField.sendKeys("shah");

        driver.findElement(By.name("DateOfBirthDay")).sendKeys("1");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("Nov");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1999");



        //find the email field and type the email address to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("heny123@gmail.com");

        //find the password field and type the password to  password field
        driver.findElement(By.name("Password")).sendKeys("heny123");
        //find the confirm password field and type the password to confirm password field
        driver.findElement(By.name("ConfirmPassword")).sendKeys("heny123");
        WebElement Register_button =  driver.findElement(By.linkText("Register"));
        Register_button.click();
        String expectedText = "Your registration cpmpleted";
        //find the actual text element and get the text from element
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='result']"));
        String actualText = actualTextElement.getText();
        //Verify expected and actual text
        Assert.assertEquals("Your registration completed",expectedText,actualText);



    }
    @After
    public void tearDown () {
        closeBrowser();

    }
}
