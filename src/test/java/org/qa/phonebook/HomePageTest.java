package org.qa.phonebook;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getHomePage().isHomeComponentPresent()){
            app.getHomePage().clickOnHomeLink();
        }
    }

    @Test
    public void isHomeComponentPresentTest(){
       //System.out.println("Home Component is "+ isHomeComponentPresent());
//       System.out.println("Home Component is "+
//               isElementPresent(By.xpath("//h1[text()='Home Component']")));

        Assert.assertTrue(app.getHomePage().isHomeComponentPresent());
    }
}
