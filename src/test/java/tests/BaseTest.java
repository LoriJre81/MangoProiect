package tests;
import SignInPage.SignInPage;
import org.testng.annotations.AfterSuite ;
import org.testng.annotations.BeforeSuite   ;
import pages.BasePage ;

public class BaseTest {
    public SignInPage signInPage=SignInPage.getInstance();



    @BeforeSuite
    public void init(){
        BasePage.setUp();

    }
     @AfterSuite
    public void tearDown(){
        BasePage.tearDown();
     }



}
