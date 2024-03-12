package pages.Newsletter;


import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Newsletter extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(Newsletter.class);
    public static Newsletter instance;

    private Newsletter() {
    }

    public static Newsletter getInstance() {
        if (instance == null) {
            instance = new Newsletter();
        }
        return instance;
    }


    // private static By scrollBar=By.xpath("//div[@class='JBdh_']") ;
    private static By emailField = By.xpath("//input[@class='sg-input-line']");
    private static By submitButton = By.xpath("//button[@type='submit']");


    // public static void scrollBar(){
    //  LOG.info("Scrolling to WebElement");
    //  driver.findElement((By.xpath("//form[@class='ezV1h CHbs1']")));
//}








    public static void insertemailField(String email) {
        LOG.info("input 'Email' address in field");
        driver.findElement(emailField).sendKeys(email);

    }
    public static boolean isSubmitButtonDisplayed() {
        LOG.info("Verify if 'Submit'button is displayed");
        return driver.findElement(submitButton).isDisplayed();
    }



    public static void clickSubmitButton(){
        LOG.info("Click 'Submit'button") ;
        driver.findElement(submitButton).click();



    }



}
