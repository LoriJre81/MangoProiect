package SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
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
    private By clickAiUitatParolaButton = By.xpath("//p[@class='plSoA']");
    private By clickMentineConectarea = By.xpath("//input[@id='autoLogin']");
    private By searchIcon = By.xpath("//i[@class='icon-outline-search']");


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

    public boolean isSearchIconDisplayed(){
        LOG.info("Verify  if search icon is displayed");
        return driver.findElement(searchIcon).isDisplayed();


    }


}




