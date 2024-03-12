package tests;
import SignInPageAndRegisterPage.SignInPageAndRegisterPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.AddToCart.AddToCart;
import pages.BasePage;
import pages.SearchField.SearchField;

public class BaseTest {
    public SignInPageAndRegisterPage signInPageAndRegisterPage = SignInPageAndRegisterPage.getInstance();
    public SearchField SearchField = pages.SearchField.SearchField.getInstance() ;
    public AddToCart AddToCart= pages.AddToCart.AddToCart.getInstance() ;


    @BeforeSuite
    public void init(){
        BasePage.setUp();

    }
     @AfterSuite
    public void tearDown(){
        BasePage.tearDown();
     }



}
