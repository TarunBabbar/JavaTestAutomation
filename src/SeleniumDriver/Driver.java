package SeleniumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {

    private static String driverPath = "C:/TarunBabbar/ChromeDriver/driver/";
    public static WebDriver webDriver;

    public void InitializeChromeDriver(String url) {
        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");

        List<String> listOfArguments = new ArrayList<>(Arrays.asList("no-sandbox", "test-type", "--disable-extensions", "disable-infobars"));
        ChromeOptions options = new ChromeOptions();
        options.addArguments(listOfArguments);
        webDriver = new ChromeDriver(options);
        webDriver.manage().window().maximize();
        webDriver.navigate().to(url);
    }
}
