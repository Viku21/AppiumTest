package AppiumController;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumSetup {
    public AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
            // capabilities to launch the app
            File appDir = new File(
                    "/Users/vikashbharat/Desktop/Vikash/Appium_Test");
            File app = new File(appDir, "Login.app");

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.PLATFORM_NAME, "iOS");
            capabilities.setCapability("platformVersion", "11.4");
            capabilities.setCapability("deviceName", "iPhone 8 Plus");
            capabilities.setCapability("bundleid", "Conduent.Login");
            capabilities.setCapability("app", app.getAbsolutePath());

            driver = new IOSDriver<>(
                    new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

    }
}


