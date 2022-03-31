package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

import java.time.Duration;


public class LoginTest {

    @BeforeClass
    public static void setup() {

        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @Test
    public void loginTest() {
        LoginPage.inputLogin(ConfProperties.getProperty("pavel@gmail.com"));
        LoginPage.inputPasswd(ConfProperties.getProperty("password"));
        LoginPage.clickLoginBtn();
    }

    @AfterClass
    public static void tearDown() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        driver.quit(); }

}