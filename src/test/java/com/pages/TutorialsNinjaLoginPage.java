package com.pages;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;


public class TutorialsNinjaLoginPage {

    WebDriver ldriver;

    public TutorialsNinjaLoginPage(WebDriver rdriver){

        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
    @CacheLookup
    private WebElement myAccountLink;

    @FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    @CacheLookup
    private WebElement loginLink;

    @FindBy(xpath="//*[@id=\"input-email\"]")
    @CacheLookup
    private WebElement submitEmailAddress;

    @FindBy(xpath="//*[@id=\"input-password\"]")
    @CacheLookup
    private WebElement submitPassWord;

    @FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
    @CacheLookup
    private WebElement loginBtn;

    public void clickMyAccountLink(){

        Wait<WebDriver> wait =  new FluentWait<>(ldriver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class);
        wait.until(
                d -> { myAccountLink.isDisplayed();
                        return true;
                        }
                );
        
        myAccountLink.click();

    }
    public void clickLoginLink(){

        Wait<WebDriver> wait =  new FluentWait<>(ldriver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class);
        wait.until(
                d -> { loginLink.isDisplayed();
                    return true;
                }
        );
        loginLink.click();

    }

    public void submitEmailAddress(String emailAddress){

        Wait<WebDriver> wait =  new FluentWait<>(ldriver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class);
        wait.until(
                d -> { submitEmailAddress.isDisplayed();
                    return true;
                }
        );
        submitEmailAddress.clear();
        submitEmailAddress.sendKeys(emailAddress);

    }

    public void submitPassWord(String passWord){

        Wait<WebDriver> wait =  new FluentWait<>(ldriver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class);
        wait.until(
                d -> { submitPassWord.isDisplayed();
                    return true;
                }
        );
        submitPassWord.clear();
        submitPassWord.sendKeys(passWord);

    }

    public void submitLogin(){

        Wait<WebDriver> wait =  new FluentWait<>(ldriver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class);
        wait.until(
                d -> { loginBtn.isDisplayed();
                    return true;
                }
        );
        loginBtn.click();

    }
}
