package pages.PaymentMethod;


import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class PaymentMethod extends BasePage {


    private static final Logger LOG = LoggerFactory.getLogger(PaymentMethod.class);
    public static PaymentMethod instance;


    private PaymentMethod() {
    }

    public static PaymentMethod getInstance() {

        if (instance == null) {
            instance = new PaymentMethod();
        }
        return instance;
    }

    private static final By searchButton = By.xpath("//span[.='Căutare']");
    private static final By acceptConsent = By.xpath("//span[text()='Le accept pe toate']");
    private static final By searchField = By.xpath("//input[@type='search']");






    public boolean isSearchButtonDisplayed() {
        LOG.info("Verify if 'Search' button is displayed");
        return driver.findElement(searchButton).isDisplayed();
    }


    public static void clickSearchButton() {
        LOG.info("Click 'Search'button ");
        driver.findElement(searchButton).click();


    }

    public static void acceptConsent() {
        LOG.info("Click the 'Consent' button");
        driver.findElement(acceptConsent).click();
    }

    public static void insertSearchField(String product) {
        LOG.info("Insert search field");
        driver.findElement(searchField).sendKeys(product);



    }






}


