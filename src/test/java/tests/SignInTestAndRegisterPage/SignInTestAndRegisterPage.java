package tests.SignInTestAndRegisterPage;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseURL;
import static pages.BasePage.sleep;


public class SignInTestAndRegisterPage extends BaseTest {

    public static final Logger LOG = LoggerFactory.getLogger(SignInTestAndRegisterPage.class);
    private String newUrl = getBaseURL() + "signup.faces";

    @Test
    public void SignIn() {

        String email="c_lory81@yahoo.com" ;
        String password="Loredana2011" ;
        String phone="726241394" ;



        LOG.info("Check Sign in button");
        Assert.assertTrue(signInPageAndRegisterPage.isSignINButtonDisplayed(), "Button is not displayed");

        LOG.info("Click  'Sign in' button");
        signInPageAndRegisterPage.clickSignInButton();
        sleep(5000L);
        signInPageAndRegisterPage.acceptConsent();

        LOG.info("Verify is logo is displayed");
        Assert.assertTrue(signInPageAndRegisterPage.isLogoDisplayed(), "Logo is not displayed");
        sleep(5000);


        LOG.info("insert email");
        signInPageAndRegisterPage.insertemailField(email);

        LOG.info("insert password");
        signInPageAndRegisterPage.insertPassword(password);

        LOG.info("enter button");
        signInPageAndRegisterPage.clickenterButton();
        sleep(5000);

        LOG.info("Verify if error message is displayed");
        Assert.assertTrue(signInPageAndRegisterPage.iserrorMessageDisplayed(), "error message is displayed");


        LOG.info("Click 'Creare cont'button");
        signInPageAndRegisterPage.clickCreareContButton();


        sleep(5000);

        LOG.info("Inserting email");
        signInPageAndRegisterPage.insertEmailField(email);


        LOG.info("Inserting password ");
        signInPageAndRegisterPage.insertPasswordField(password);



        LOG.info("Type in phone number") ;
        signInPageAndRegisterPage.insertPhoneNumber(phone) ;



    }


}
