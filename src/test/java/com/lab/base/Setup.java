package com.lab.base;

import com.lab.banktest.AddCustomer;
import com.lab.banktest.HomePage;
import com.lab.banktest.ManagerDasboard;
import com.lab.banktest.OpenAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
    protected static WebDriver driver;
    protected static HomePage homePage;
    protected static ManagerDasboard managerDasboard;
    protected static AddCustomer addCustomer;
    protected static OpenAccount openAccount;


    @BeforeAll
    public static void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        homePage = new HomePage(driver);
        managerDasboard =new ManagerDasboard(driver);
        addCustomer = new AddCustomer(driver);
        openAccount =new OpenAccount(driver);
    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
