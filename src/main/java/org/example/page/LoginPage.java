package org.example.page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.example.util.DriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(AndroidDriver.builder().build(), this);
    }

    public void signInWithEmailAndPassword() {
        WebElement el5 = DriverSetup.androidDriver.findElement(AppiumBy.id("com.example.odev2:id/btn_signIn_toSignUp"));
        el5.click();
        WebElement el6 = DriverSetup.androidDriver.findElement(AppiumBy.id("com.example.odev2:id/et_email"));
        el6.sendKeys("aaa@aaa.com");
        WebElement el7 = DriverSetup.androidDriver.findElement(AppiumBy.id("com.example.odev2:id/et_password"));
        el7.sendKeys("123456");
        WebElement el8 = DriverSetup.androidDriver.findElement(AppiumBy.id("com.example.odev2:id/et_rePassword"));
        el8.sendKeys("123456");
        WebElement el9 = DriverSetup.androidDriver.findElement(AppiumBy.id("com.example.odev2:id/btn_signUp_toSignIn"));
        el9.click();
        WebElement el10 = DriverSetup.androidDriver.findElement(AppiumBy.id("com.example.odev2:id/et_email"));
        el10.sendKeys("aaa@aaa.com");
        WebElement el11 = DriverSetup.androidDriver.findElement(AppiumBy.id("com.example.odev2:id/et_password"));
        el11.sendKeys("123456");
        WebElement el12 = DriverSetup.androidDriver.findElement(AppiumBy.id("com.example.odev2:id/btn_signIn_toHome"));
        el12.click();
    }
}
