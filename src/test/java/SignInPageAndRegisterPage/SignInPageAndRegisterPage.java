package SignInPageAndRegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SignInPageAndRegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPageAndRegisterPage.class);
    public static SignInPageAndRegisterPage instance;

    private SignInPageAndRegisterPage() {
    }

    public static SignInPageAndRegisterPage getInstance() {
        if (instance == null) {
            instance = new SignInPageAndRegisterPage();
        }
        return instance;
    }


    private By signInButton = By.xpath("//span[.='Conectează-te']");
    private By acceptConsent = By.xpath("//span[text()='Le accept pe toate']");
    private By logo = By.xpath("//img[@alt='MANGO Logo']");
    private By emailField = By.xpath("//input[@id='loginEmail']");
    private By passwordfield = By.xpath("//input[@id='loginPassword']");
    private By enterButton = By.xpath("//button[@data-testid='registro.login.loginButton.login']");
    private By errorMessage = By.xpath("//p[@class='text-body-s mFgwe']");
    private By creareContButton = By.xpath("//button[@id='createAccountButtonId']");
    private By clickAiUitatParolaButton = By.xpath("//a[@href='RO/resetpassword']");
    private By clickMentineConectarea = By.xpath("//input[@id='autoLogin']");
    private By searchIcon = By.xpath("//i[@class='icon-outline-search']");
    private By inputEmailField = By.xpath("//input[@id='registryEmail']") ;
    private By inputPasswordField = By.xpath("//input[@id='registryPassword']");
    private By selectCountryPrefix = By.xpath("//select[@id='mobile-prefixCountryCode']");
    private By insertPhoneNumber=By.xpath("//input[@id='mobile-number']");


    public void clickSignInButton() {
        LOG.info("Click 'Sign In' Button ");
        driver.findElement(signInButton).click();
    }

    public void acceptConsent() {
        LOG.info("Click the 'Consent' button");
        driver.findElement(acceptConsent).click();
    }

    public boolean isSignINButtonDisplayed() {
        LOG.info("Verify if 'Sign In Button'is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo image is displayed");
        return driver.findElement(logo).isDisplayed();


    }

    public void insertemailField(String email) {
        LOG.info("input Email address in field");
        driver.findElement(emailField).sendKeys(email);

    }

    public void insertPassword(String Password) {
        LOG.info("input password in field");
        driver.findElement(passwordfield).sendKeys(Password);
    }

    public void clickenterButton() {
        LOG.info("signInPage.clickSignInButton(); ");
        driver.findElement(enterButton).click();
    }

    public boolean iserrorMessageDisplayed() {
        LOG.info("Verify  if error message is displayed");
        return driver.findElement(errorMessage).isDisplayed();
    }


    public void clickBack() {

        LOG.info("Click back in browser");
        driver.navigate().back();
    }

    public void clickCreareContButton() {
        LOG.info("Click 'Creare cont'button");
        driver.findElement(creareContButton).click();


    }

    public void clickAiUitatParolaButton() {
        LOG.info("Click 'Ai uitat parola'button");
        driver.findElement(clickAiUitatParolaButton).click();


    }

    public void clickMentineCautarea() {
        LOG.info("Click 'Mentine conectarea'button");
        driver.findElement(clickMentineConectarea).click();


    }

    public boolean isSearchIconDisplayed() {
        LOG.info("Verify  if search icon is displayed");
        return driver.findElement(searchIcon).isDisplayed();


    }
    public void insertEmailField(String email) {
        LOG.info("Inserting email field");
        driver.findElement(inputEmailField).sendKeys(email);


    }

    public void insertPasswordField(String password) {
        LOG.info("Inserting password");
        driver.findElement(inputPasswordField).sendKeys(password);


    }


    public void selectCountryPrefix(String prefix) {
        LOG.info("Selecting Prefix");
        driver.findElement(selectCountryPrefix).click();
        driver.findElement(selectCountryPrefix).sendKeys(prefix);
        driver.findElement(selectCountryPrefix).sendKeys(Keys.ENTER);


    }
    public void insertPhoneNumber(String phone) {
        LOG.info("Insert phone number");
        driver.findElement(insertPhoneNumber).sendKeys(phone);
    }


}




