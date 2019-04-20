package abc1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstAutomationTest extends Utils {

@Before
    public void setup(){
    System.setProperty("webdriver.chrome.driver","src\\test\\java\\Browserdriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://demo.nopcommerce.com/");
}

@Test
    public void userShouldbeAbleRegisterSuccessfully() {
    //Click on Register
    clickElementBy(By.xpath("//div[2]/div[1]/ul/li[1]/a"));

    //Enter the User Firstname
    enterText(By.xpath("//input[@name='FirstName']"), "shivangi");

    //Enter the User Lastname
    enterText(By.xpath("//*[@id='LastName']"),"patel");

    //Enter the User Email
    String UserName = ""+( int) (Math.random()* Integer.MAX_VALUE);
    String EmailID ="shivangip1"+UserName+"@test.com";
    enterText(By.xpath("//*[@id=\'Email\']"),EmailID);

    //Enter the User Password
    enterText(By.xpath("//input[@id='Password']"),"shivangi123");
    //Enter the User ConfirmPassword
    enterText(By.xpath("//input[@name='ConfirmPassword']"),"shivangi123");

    //Click on Register button
    clickElementBy(By.xpath("//input[@id='register-button']"));

    //Get Successfull Message
    waitForElementDisplay(By.xpath("//div[@class='result']"),15);


}

@Test
    public void userShoulbeAbletoNavigateNotebookCategorypage(){

    //Navigate to Computers<<Notebooks Category Page
    //Click on Computers
    clickElementBy(By.linkText("Computers"));

    //Click on Notebooks
    clickElementBy(By.partialLinkText("Notebooks"));

    //Expected Result
    waitForElementDisplay(By.xpath("//div[@class='page-title']"),10);


}
@Test
    public void userShouldbeAbletoNavigateCellphonepage(){

    //Navigate to Electronics<<Cellphones
    //Click on Electronics
    clickElementBy(By.linkText("Electronics"));

    //Click on Cellphones
    clickElementBy(By.partialLinkText("Cell phones"));

    //Expected Result
    waitForElementDisplay(By.xpath("//div[@class='page-title']"),10);
    System.out.println("User should be able to navigate electronics category page");

}
@Test
    public void userSholdbeAbletoLogin(){
    //Enter the Login Details
    //Click on Login
    clickElementBy(By.xpath("//a[@class='ico-login']"));

    //Enter User Email
    enterText(By.xpath("//input[@id='Email']"),"shivangip@test.com");

    //Enter User password
    enterText(By.xpath("//input[@class='password']"),"shivangi123");

    //Click on Login button
    clickElementBy(By.xpath("//input[@class='button-1 login-button']"));

    //Expected Result
    waitForElementDisplay(By.xpath("//a[@class='ico-logout']"),10);
    System.out.println("User should be login successfully ");}

@Test
public void userShoulbeAbletoAddProductinShoopingcart(){
    //Click on Computers
    clickElementBy(By.linkText("Computers"));

    //Click on Desktop
    clickElementBy(By.partialLinkText("Desktops"));

    //Build Your own computers Product Add into ShoppingCart
    clickElementBy(By.xpath("//input[@value='Add to cart']"));

    //Expected Result
    waitForElementDisplay(By.xpath("//div[@class='product-name']"),10);
    System.out.println("User should be able to add products");
}

@After
public void closebrowser(){ driver.quit();}




}

