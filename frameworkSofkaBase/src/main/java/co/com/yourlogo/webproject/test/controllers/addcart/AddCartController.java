package co.com.yourlogo.webproject.test.controllers.addcart;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import co.com.yourlogo.webproject.test.page.AddCart.AddCartPage;
import co.com.yourlogo.webproject.test.page.AddCart.BuyProductPage;
import co.com.yourlogo.webproject.test.util.TImeOut;


public class AddCartController {
    private WebAction webAction;



    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }
    public void AddCart(){
        try{
            AddCartPage addCartPage = new AddCartPage(webAction.getDriver());
            webAction.click(addCartPage.getCart(), TImeOut.TIME_OUT_RESOURCE.getValue(), true);


        }catch (WebActionsException exception){
            Report.reportFailure("Se presento una falla.", exception);

        }
    }

    public String pageinit(){
        String addcart = "";
        try{
            AddCartPage addCartPage = new AddCartPage(webAction.getDriver());
            addcart = webAction.getText(addCartPage.getCart(),
                    TImeOut.TIME_OUT_RESOURCE.getValue(), true);

        }catch (WebActionsException exception){
            Report.reportFailure("Se presento un error", exception);

        }
        return addcart;
    }

    public void buyCart(){
        try{
            BuyProductPage buyProductPage = new BuyProductPage(webAction.getDriver());
            webAction.scroll(800);
            webAction.moveTo(buyProductPage.getSelectProduct(),TImeOut.TIME_OUT_RESOURCE.getValue(), true);
            webAction.moveTo(buyProductPage.getAddProduct(),TImeOut.TIME_OUT_RESOURCE.getValue(), true);
            webAction.moveTo(buyProductPage.getContinueBuying(),TImeOut.TIME_OUT_RESOURCE.getValue(), true);


        }catch (WebActionsException exception){
            Report.reportFailure("Se presento un error", exception);
        }

    }

    public String ButSelect(){
        String select = "";
        try{BuyProductPage buyProductPage = new BuyProductPage(webAction.getDriver());
            webAction.scroll(200);
            webAction.getText(buyProductPage.getSelectProduct(), TImeOut.TIME_OUT_RESOURCE.getValue(), true);

        }catch (WebActionsException e){
            Report.reportFailure("Se presento un error", e);

        }
        return select;
    }
}
