package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[contains(@id, 'email')]")
    private static WebElement loginField;

    @FindBy(xpath = "//*[contains(@id, 'u_0_d_o9')]")
    private static WebElement loginBtn;

    @FindBy(xpath = "//*[contains(@id, 'passContainer')]")
    private static WebElement passwdField;

    public static void inputLogin(String login) {
        loginField.sendKeys(login); }

    public static void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }

    public static void clickLoginBtn() {
        loginBtn.click(); }
}