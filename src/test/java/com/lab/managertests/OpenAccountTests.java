package com.lab.managertests;

import com.lab.base.Setup;
import org.junit.jupiter.api.Test;

public class OpenAccountTests extends Setup {
    @Test
    public void testSuccessfulOpenAccount(){
        homePage.clickManagerLogin();
        managerDasboard.clickOpenAccountButton();
        openAccount.selectCustomerDropDwn("Harry Potter");
        openAccount.setCurrencyDropDown("Dollar");
        openAccount.clickProcessButton();
    }


}
