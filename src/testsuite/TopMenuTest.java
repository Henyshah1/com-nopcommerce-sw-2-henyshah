package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        WebElement computers =  driver.findElement(By.linkText("Computers"));
        computers.click();
        String expectedErrorMessage = "Computers";
        //find the errormessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Computers ']")).getText();
        Assert.assertEquals("Computers", expectedErrorMessage,actualErrorMessage);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        WebElement computers =  driver.findElement(By.linkText("Electronics"));
        computers.click();
        String expectedErrorMessage = "Electronics";
        //find the errormessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Electronics ']")).getText();
        Assert.assertEquals("Electronics", expectedErrorMessage,actualErrorMessage);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        WebElement computers =  driver.findElement(By.linkText("Apparel"));
        computers.click();
        String expectedErrorMessage = "Apparel";
        //find the errormessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Apparel ']")).getText();
        Assert.assertEquals("Apparel", expectedErrorMessage,actualErrorMessage);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        WebElement computers =  driver.findElement(By.linkText("Digital downloads"));
        computers.click();
        String expectedErrorMessage = "Digital downloads";
        //find the errormessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Digital downloads ']")).getText();
        Assert.assertEquals("Digital downloads", expectedErrorMessage,actualErrorMessage);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        WebElement computers =  driver.findElement(By.linkText("Books"));
        computers.click();
        String expectedErrorMessage = "Books";
        //find the errormessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Books ']")).getText();
        Assert.assertEquals("Books", expectedErrorMessage,actualErrorMessage);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        WebElement computers =  driver.findElement(By.linkText("Jewelry"));
        computers.click();
        String expectedErrorMessage = "Jewelry";
        //find the errormessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Jewelry ']")).getText();
        Assert.assertEquals("Jewelry", expectedErrorMessage,actualErrorMessage);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        WebElement computers =  driver.findElement(By.linkText("Gift Cards"));
        computers.click();
        String expectedErrorMessage = "Gift Cards";
        //find the errormessage element and get the text
        String actualErrorMessage = driver.findElement(By.xpath("//a[text()='Gift Cards ']")).getText();
        Assert.assertEquals("Gift Cards", expectedErrorMessage,actualErrorMessage);
    }
    @After
    public void tearDown () {
        closeBrowser();

    }



}
