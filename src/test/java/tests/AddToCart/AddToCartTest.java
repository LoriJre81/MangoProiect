package tests.AddToCart;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class AddToCartTest extends BaseTest {

    public static final Logger LOG = LoggerFactory.getLogger(AddToCartTest.class);

    private final String newURL = getBaseURL() ;

    String colour = "Gri";
    String numar = "38";


    @Test
    public void AddToCart() {
        driver.get(newURL);


        LOG.info("click Femei icon");
        AddToCart.clickFemeiIcon();
        sleep(5000L);
        AddToCart.acceptConsent();


        LOG.info("click blugi");
        AddToCart.clickBlugi();
        sleep(5000L);

        LOG.info("click filtreaza si ordoneaza");
        AddToCart.clickFiltreazaOrdoneaza();
        sleep(5000L);


        LOG.info("click colour button");
        AddToCart.clickColourButton();
        sleep(3000L);


        LOG.info("Select colour");
        AddToCart.selectColour(colour);
        sleep(3000L);


        LOG.info("Select size");
        AddToCart.selectSize(numar);
        sleep(3000L);


        LOG.info("Click 'afiseaza articolele' button");
        AddToCart.clickAfiseazaArticoleleButton();
        sleep(3000L);


        LOG.info("Click product");
        AddToCart.selectProduct();

        LOG.info("Click colour product") ;
        AddToCart.selectColourProduct();


        LOG.info("Click size button") ;
        AddToCart.clickSizeButton();


        LOG.info("Click size product") ;
        AddToCart.clickSizeProduct();


        LOG.info("Click add to cart") ;
        AddToCart.clickAddToCart();


    }


}
