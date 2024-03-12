package tests.PaymentMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PaymentMethod.PaymentMethod;
import tests.BaseTest;

import static pages.BasePage.getBaseURL;
import static pages.BasePage.sleep;


public class PaymentMethodTest extends BaseTest {

    public static final Logger LOG = LoggerFactory.getLogger(PaymentMethodTest.class);
    private final String newUrl = getBaseURL() + "search?kw";
    private String newURL;


    @Test
    public void PaymentMethod() {

        String product = "geanta" ;

        LOG.info("Check 'Search' button");
        Assert.assertTrue(SearchField.getInstance().isSearchButtonDisplayed(), "Button is not displayed");


        LOG.info("Click  'Search ' button");
        PaymentMethod.clickSearchButton();
        sleep(5000L);
        PaymentMethod.acceptConsent();


        LOG.info("insert 'geanta'in search field");
        PaymentMethod.insertSearchField(product) ;
        sleep(3000L);


    }


}













