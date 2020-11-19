package com.company.statuspage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BrowserSelector {


    PropertyReader propertyReader = new PropertyReader();
    String browser = propertyReader.getProperty("browser");
    String baseUrl = propertyReader.getProperty("baseUrl");
    @BeforeMethod
    public void openBrowser(){
        selectBrowser(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
