package org.example.util;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;


public class DriverSetup {

    public static final String ANDROID_BASE_URL = System.getenv("BASE_URL");
    public static final String ANDROID_APP_PACKAGE = System.getenv("AppPackage");
    public static final String ANDROID_PLATFORM_NAME = System.getenv("PlatformName");
    public static final String ANDROID_DEVICE_NAME = System.getenv("DeviceName");
    private static final String ANDROID_APP_ACTIVITY = System.getenv("AppActivity");
    private static final String ANDROID_AUTOMATION_NAME = System.getenv("AutomationName");
    public static AndroidDriver androidDriver;


    @BeforeSuite
    public static void setupDriver() throws IOException {
        prepareAndroidForAppium();

    }

    public static void prepareAndroidForAppium() throws IOException {
        System.out.println("---- Yeni test oturumu başlatılıyor ----");

        URL appiumServerURL = new URL("http://127.0.0.1:4723/wd/hub");

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("emulator-5554");
        options.setAppPackage("com.example.odev2");
        options.setAppActivity("com.example.odev2.main.MainActivity");

        options.setNoReset(false);
        options.setFullReset(false);

        androidDriver = new AndroidDriver(appiumServerURL, options);
    }

    @AfterSuite
    public static void tearDown() {
        if (androidDriver != null) {
            androidDriver.quit();
            System.out.println("Appium oturumu sonlandırıldı.");
        }
        System.out.println("---- Test oturumu tamamlandı ----\n");
    }
}
