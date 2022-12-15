package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {

    //Localizadores de elementos
    public static By userInput = By.id("email");
    public static By passInput = By.id("password");
    public static By loginButton = By.id("btn_submit");
    public static By optionButton = By.xpath("//*[@id='topmenu']/div[4]/nav/div/div/div/div/ul/li[7]/h2/button");
}
