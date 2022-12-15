package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import com.nttdata.page.LoginPage;
import io.cucumber.java.sl.In;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventorySteps {

    private WebDriver driver;

    //constructor
    public InventorySteps(WebDriver driver){
        this.driver = driver;
    }

    ///obtiene el titulo
    public String getTitle(){
        return this.driver.findElement(InventoryPage.productsTitle).getText();
    }
    /// obtiene el banner flotante
    public String getBanner(){
        return this.driver.findElement(InventoryPage.Productsbanner).getText();
    }
    ///seleciona el primer Item
    public void items(){
        this.driver.findElement(InventoryPage.ItemsSelect).click();
    }
    //agrega al carrito compras
    public void carrito(){
        this.driver.findElement(InventoryPage.carritoButton).click();
    }

}
