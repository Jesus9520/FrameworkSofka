package co.com.yourlogo.webproject.test.page.AddCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartPage {

    @FindBy(css = ".shopping_cart > a")
    @CacheLookup
    WebElement Cart;

    @FindBy(css = ".step_current > span")
    @CacheLookup
    WebElement ListCart;


    public AddCartPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public WebElement getCart() {
        return Cart;
    }

    public WebElement getListCart() {
        return ListCart;
    }
}
