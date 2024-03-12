package tests.Newsletter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Newsletter.Newsletter;
import tests.BaseTest;

import static pages.BasePage.getBaseURL;
import static pages.BasePage.sleep;

public class NewsletterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(NewsletterTest.class);
    private final String newUrl = getBaseURL();



    @Test
    public void Newsletter() {


        String email = "c_lory81@yahoo.com";





        LOG.info("insert email");
        Newsletter.insertemailField(email);
        sleep(3000);

        LOG.info("Verify if 'Submit'button is displayed") ;
        Assert.assertTrue(pages.Newsletter.Newsletter.isSubmitButtonDisplayed(),"Button is not displayed") ;



        LOG.info("Click 'Submit'button") ;
        pages.Newsletter.Newsletter.clickSubmitButton();



    }


}
