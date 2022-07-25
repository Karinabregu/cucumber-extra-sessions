package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackPage {
    public VytrackPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (name = "_username")
    public WebElement userNameInput;

    @FindBy (name = "_password")
    public WebElement passwordInput;

    @FindBy (id = "_submit")
    public WebElement loginBtn;

    @FindBy (xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetModule;

    @FindBy (xpath = "(//span[@class='title title-level-2'])[1]")
    public WebElement vehicleModule;

    @FindBy (xpath = "//i[@class='fa-repeat']")
    public WebElement refreshBtn;






}
