package org.example.page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.example.util.DriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(DriverSetup.androidDriver, this);
    }

    public void signInWithEmailAndPassword() {
        WebDriverWait wait = new WebDriverWait(DriverSetup.androidDriver, Duration.ofSeconds(10));

        // Örnek olarak signup ekranındaki buton
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.example.odev2:id/btn_signIn_toSignUp"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.example.odev2:id/et_email")))
                .sendKeys("aaa@aaa.com");
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.example.odev2:id/et_password")))
                .sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.example.odev2:id/et_rePassword")))
                .sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.example.odev2:id/btn_signUp_toSignIn"))).click();

        // Sign in ekranı açıldıktan sonra tekrar bul ve kullan
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.example.odev2:id/et_email")))
                .sendKeys("aaa@aaa.com");
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.example.odev2:id/et_password")))
                .sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.example.odev2:id/btn_signIn_toHome"))).click();
    }

}
