package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    public static By productsTitle = By.xpath("//*[@id='body-cuenta']/div[3]/div[1]/div/div/div[1]/div[2]/a/p[1]");
    public static By ItemsSelect = By.xpath("//a[@data-position='1']");
    public static By carritoButton = By.id("btn_add_cart_full");
    public static By Productsbanner = By.xpath("//*[contains(text(),'Agregado correctamente.')]");
}
