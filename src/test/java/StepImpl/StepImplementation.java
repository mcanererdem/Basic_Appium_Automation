package StepImpl;

import com.thoughtworks.gauge.Step;
import org.example.page.LoginPage;
import org.example.util.DriverSetup;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class StepImplementation  {
    static {
        try {
            DriverSetup.setupDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private LoginPage loginPage = new LoginPage();


    public LoginPage pageObject() throws IOException {
        System.out.println("Driver null mu? " + (DriverSetup.androidDriver == null));
        if (DriverSetup.androidDriver == null) {
            DriverSetup.setupDriver();
        }
        loginPage = PageFactory.initElements(DriverSetup.androidDriver, LoginPage.class);
        return loginPage;
    }

    @Step("Sign in with email and password")
    public void signInWithEmailPassword() throws IOException {
        pageObject().signInWithEmailAndPassword();
    }
}
