package co.com.yourlogo.webproject.test.stepdefinition;

import co.com.sofka.test.actions.WebAction;
import co.com.yourlogo.webproject.test.controllers.openwebpage.StartBrowserWebController;
import co.com.yourlogo.webproject.test.data.objects.TestInfo;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class AddCartStepDefinition extends Setup{

    private WebAction webAction;

    @Before
    public void setup(Scenario scenario){
        testInfo = new TestInfo(scenario);
        webAction = new WebAction(testInfo.getFeatureName());
        webAction.setScenario(testInfo.getScenarioName());
    }

    @Dado("Que el cliente se encuentra en la pagina de inicio")
    public void que_el_cliente_se_encuentra_en_la_pagina_de_inicio() {

        StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
        startBrowserWebController.setWebAction(webAction);
        startBrowserWebController.setBrowser(browser());
        startBrowserWebController.setFeatue(testInfo.getFeatureName());
        startBrowserWebController.abrirTiendaOnline();

    }

    @Cuando("El cliente ingresa al carrito de compras")
    public void el_cliente_ingresa_al_carrito_de_compras() {


    }

    @Entonces("como retorno de busqueda se despliega lista del carrito de compras")
    public void como_retorno_de_busqueda_se_despliega_lista_del_carrito_de_compras() {

    }

    @Cuando("El cliente selecciona un articulo de la seccion popular al carrito")
    public void el_cliente_selecciona_un_articulo_de_la_seccion_popular_al_carrito() {

    }

    @Entonces("como resultado el cliente valida el producto agregado a la lista de productos del carrito")
    public void como_resultado_el_cliente_valida_el_producto_agregado_a_la_lista_de_productos_del_carrito() {

    }



}
