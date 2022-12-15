package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.LoginSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginStepsDef {

    private WebDriver driver;
    private Scenario scenario;

    private InventorySteps inventorySteps(WebDriver driver){
        return new InventorySteps(driver);
    }

    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

    @Dado("que me encuentro en la página de login de Platanitos")
    public void que_me_encuentro_en_la_página_de_login_de_Platanitos() {

        //driver.get("https://www.linio.com.pe/");
        driver.get("https://platanitos.com/iniciar-sesion");

    }
    @Cuando("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicio_sesión_con_las_credenciales_usuario_y_contraseña(String user, String password) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        loginSteps.login();

    }
    @Y("valido que debería aparecer el título de {string}")
    public void valido_que_debería_aparecer_el_título_de(String expectedTitle) {
        String title =  inventorySteps(driver).getTitle();
        //prueba: validamos el título del producto
        Assertions.assertEquals(expectedTitle, title);
    }

    @Entonces("ingreso a la opcion {string}")
    public void ingresarALaOpcion(String arg0) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.calificados();
    }

    @Y("doy click a item")
    public void darClickAItem() {
        InventorySteps items=new InventorySteps(driver);
        items.items();
    }

    @Y("agregar al carrito de compras")
    public void agregarAlCarritoDeCompras() {
        InventorySteps car=new InventorySteps(driver);
        car.carrito();
    }

    @Y("valido que debería aparecer el banner {string}")
    public void valido_que_debería_aparecer_el_banner(String ban) throws InterruptedException {
        String banner =  inventorySteps(driver).getBanner();
        //prueba: validamos el banne de agregado
        Assertions.assertEquals(ban, banner);
        Thread.sleep(5000);



    }

}

