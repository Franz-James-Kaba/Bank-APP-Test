package com.lab.managertests;

import com.lab.base.Setup;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class OpenAccountTests extends Setup {
    @Test
    public void testSuccessfulOpenAccount(){
        homePage.clickManagerLogin();
        managerDasboard.clickOpenAccountButton();
        openAccount.selectCustomerDropDwn("Harry Potter");
        openAccount.setCurrencyDropDown("Dollar");
        openAccount.clickProcessButton();
    }

    @Test
    public void testfailOpenAccount(){
        homePage.clickManagerLogin();
        managerDasboard.clickOpenAccountButton();
        // Verify that trying to select an invalid customer name throws an exception
        assertThrows(NoSuchElementException.class, () -> {
            openAccount.selectCustomerDropDwn("Hunter Parker");
            openAccount.setCurrencyDropDown("Dollar");
            openAccount.clickProcessButton();
        });
    }


}
