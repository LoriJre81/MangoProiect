package pages.AddToCart;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class AddToCart extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(AddToCart.class);
    public static AddToCart instance;

    private AddToCart() {
    }

    public static AddToCart getInstance() {
        if (instance == null) {
            instance = new AddToCart();
        }
        return instance;
    }

    //pagina site-click femei-click blugi-click filtreaza-click buton culoare-click culoare-click marime-
    //click afiseaza articolele-selecteaza produsul dorit cu click-click culoare-click buton marime-click masura
    //produsului-click adauga in cos




    private static By clickFemeiIcon = By.xpath("//span[.='Femei']");
    private static By acceptConsent = By.xpath("//span[text()='Le accept pe toate']");
    private static By clickBlugi = By.xpath("//h2[.='Blugi']");
    private static By clickFiltreazaOrdoneaza = By.xpath("//button[@data-testid='plp.filters.mobile.button']");
    private static By clickColourButton = By.xpath("//button[.='Culori']");
    private static By selectColour = By.xpath("//label[.='Gri']");
    private static By selectSize = By.xpath("//button[.='Mărimi']");
    private static By clickAfiseazaArticoleleButton = By.xpath("//span[.='Afișează articolele']");
    private static By selectProduct=By.xpath("//img[@alt='Blugi drepți cu talie înaltă cropped']") ;
    private static By selectColourProduct=By.xpath("//div[@id='TG']") ;
    private static By clickSizeButton=By.xpath("//span[@class='multi-size-text']") ;
    private static By clickSizeProduct=By.xpath("//span[.='38']") ;
    private static By clickAddToCart=By.xpath("//button[@id='productFormAdd']") ;


    public static void clickFemeiIcon() {
        LOG.info("click Femei Icon");
        driver.findElement(clickFemeiIcon).click();


    }

    public static void acceptConsent() {
        LOG.info("Click the 'Consent' button");
        driver.findElement(acceptConsent).click();
    }


    public static void clickBlugi() {
        LOG.info("click blugi");
        driver.findElement(clickBlugi);


    }

    public static void clickFiltreazaOrdoneaza() {
        LOG.info("click pe filtreaza si ordoneaza");
        driver.findElement(clickFiltreazaOrdoneaza);


    }

    public static void clickColourButton() {
        LOG.info("click colour button");
        driver.findElement(clickColourButton);


    }

    public static void selectColour(String colour) {
        LOG.info("Select colour");
        driver.findElement(selectColour).click();
        driver.findElement(selectColour).sendKeys(Keys.ENTER);


    }

    public static void selectSize(String numar) {
        LOG.info("Select size");
        driver.findElement(selectSize).click();
        driver.findElement(selectSize).sendKeys(Keys.ENTER);

    }

    public static void clickAfiseazaArticoleleButton(){
        LOG.info("Click 'afiseaza articolele' button") ;
        driver.findElement(clickAfiseazaArticoleleButton).click();


    }
    public static void selectProduct(){
        LOG.info("Click product") ;
        driver.findElement(selectProduct).click();



    }
    public static void selectColourProduct(){
        LOG.info("Click colour product") ;
        driver.findElement(selectColourProduct).click();





    }
    public static void clickSizeButton(){
        LOG.info("Click size button") ;
        driver.findElement(clickSizeButton).click();

    }

    public static void clickSizeProduct(){
        LOG.info("Click size product") ;
        driver.findElement(clickSizeProduct).click();



    }


    public static void clickAddToCart(){
        LOG.info("Click add to cart") ;
        driver.findElement(clickAddToCart).click();


    }


}

