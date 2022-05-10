package com.Analyzers;

import com.TestBase.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebEventListener extends Constants implements WebDriverEventListener {
    @Override
    public void beforeAlertAccept(WebDriver driver) {
        System.out.println("Alert!:-Alert has popped up prompting action");
    }

    @Override
    public void afterAlertAccept(WebDriver driver) {
        System.out.println("Success! Alert box has been accepted");
    }

    @Override
    public void afterAlertDismiss(WebDriver driver) {
        System.out.println("Success! Alert box was dismissed");
    }

    @Override
    public void beforeAlertDismiss(WebDriver driver) {
        System.out.println("Alert!: Prompting Alert box dismissal ");
    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.println("Alert!:- Browser is now navigating to the designated URL");
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        System.out.println("Success! Browser has successfully navigated to the designated URL");
    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
        System.out.println("Alert!:- Prompting Browser to Navigate back to the previous page");
    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
        System.out.println("Success! Prompt was performed successfully Browser has navigated back to previous page");
    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {
        System.out.println("Alert!:- Prompting Browser to navigate to next page");
    }

    @Override
    public void afterNavigateForward(WebDriver driver) {
        System.out.println("Success! Prompt successfull browser has navigated to the next page");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {
        System.out.println("Alert!:- Browser will now perform a refresh command of the current page");
    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {
        System.out.println("Success! Browser has successfully performed refresh command");
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Alert!:- Using the command FindBY to locate and Element of a WebPage");
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Success! Found the relative Element");
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        System.out.println("Alert!:- Now commencing command Click on a specified element in a WebPage ");
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        System.out.println("Success! Relative Element has been clicked upon");
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    @Override
    public void beforeScript(String script, WebDriver driver) {
        System.out.println("Alert!:- Now commencing Scripting");
    }

    @Override
    public void afterScript(String script, WebDriver driver) {
        System.out.println("Success! Scripting has been performed");
    }

    @Override
    public void beforeSwitchToWindow(String windowName, WebDriver driver) {
        System.out.println("Alert!:- Now commencing Switch to window");
    }

    @Override
    public void afterSwitchToWindow(String windowName, WebDriver driver) {
        System.out.println("Success:- Switch to window has been performed");
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        System.out.println("Alert!:- An Exception has been encountered :(");
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> target) {
        System.out.println("Alert!:- Taking a ScreenShot, Say Cheese :) ");
    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
        System.out.println("Success! Screenshot has been taken");
    }

    @Override
    public void beforeGetText(WebElement element, WebDriver driver) {
        System.out.println("Alert!:- Now Commencing command get Text");
    }

    @Override
    public void afterGetText(WebElement element, WebDriver driver, String text) {
        System.out.println("Success! Get Text command was completed");
    }
}
