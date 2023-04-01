package Renastech;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGexample {
    @BeforeClass
    public void setupClass(){
        System.out.println("Before class is running");
    }
    @AfterClass
    public void setupAfterClass(){
        System.out.println("After class is running");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("Before method is running");
    }
    @AfterMethod
    public void closing (){
        System.out.println("After method is running");
    }
    @Test (priority = 3)
    public void TC1_1(){
        System.out.println("Test 1 is running");
    }
    @Test (priority = 1)
    public void TC3_3(){
        System.out.println("Test 3 is running");

        String actualWorld="New York";
        String expectedWord="Ohio";

        Assert.assertEquals(actualWorld,expectedWord);
    }
    @Test (priority = 2)
    public void TC2_2(){
        System.out.println("Test 2 is running");

        String name="Alex";
        String name2="Alex";
        Assert.assertEquals(name,name2);
    }

}
