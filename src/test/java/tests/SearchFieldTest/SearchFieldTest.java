
package tests.SearchFieldTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseURL;
import static pages.BasePage.sleep;


public class SearchFieldTest extends BaseTest {

    public static final Logger LOG = LoggerFactory.getLogger(SearchFieldTest.class);

    private final String newURL = getBaseURL() ;


    @Test
    public void SearchProduct() {

        String product = "bluza";





        LOG.info("Check 'Search' button") ;
        Assert.assertTrue(SearchField.getInstance().isSearchButtonDisplayed(),"Button is not displayed");


        LOG.info("Click  'Search ' button");
        SearchField.clickSearchButton();
        sleep(5000L);
        SearchField.acceptConsent();


        LOG.info("insert 'bluza'in search field");
        SearchField.insertSearchField(product) ;
        sleep(3000L);





    }

}

















