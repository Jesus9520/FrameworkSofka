package co.com.yourlogo.webproject.test.page.AddCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyProductPage {

    @FindBy(css="#homefeatured > .ajax_block_product:nth-child(1) .replace-2x")
    @CacheLookup
    WebElement selectProduct;

    @FindBy(css=".exclusive > span")
    @CacheLookup
    WebElement addProduct;

    @FindBy(css=".continue > span")
    @CacheLookup
    WebElement continueBuying;

    @FindBy(css="a > b")
    @CacheLookup
    WebElement buyProduct;

    public BuyProductPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    public WebElement getSelectProduct() {
        return selectProduct;
    }

    public WebElement getAddProduct() {
        return addProduct;
    }

    public WebElement getContinueBuying() {
        return continueBuying;
    }

    public WebElement getBuyProduct() {
        return buyProduct;
    }
}
