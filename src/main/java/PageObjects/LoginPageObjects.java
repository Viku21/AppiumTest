package PageObjects;

import AppiumController.AppiumSetup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.*;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPageObjects {
	private AppiumDriver driver ;

	@iOSFindBy(accessibility = "login_txtField_email")
	public MobileElement email;

	@iOSFindBy(accessibility = "login_txtField_password")
	public MobileElement password;

	@iOSFindBy(accessibility = "login_btn_login")
	public MobileElement loginButton;


	public LoginPageObjects(final AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

}
