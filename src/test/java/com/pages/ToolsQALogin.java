package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ToolsQALogin {

    WebDriver ldriver;

    public ToolsQALogin(WebDriver rdriver){

        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);

    }
}
