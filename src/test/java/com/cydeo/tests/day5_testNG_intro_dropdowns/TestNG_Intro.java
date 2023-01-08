package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {
    @Test(priority = 1)
    public void test1(){
        System.out.println("Test 1 is running...");

        //ASSERT EQUALS: compare 2 of the same things
        String actual= "apple";
        String expected= "apple";
        String expected2= "apple1";

        Assert.assertEquals(actual, expected);
        Assert.assertEquals(actual, expected2);

        Assert.assertTrue(actual.equals(expected2));
    }
    @Test(priority = 2)
    public void test2() {
        System.out.println("Test 2 is running");
        String actual= "cydeo";
        String expected= "CYDEO";
        Assert.assertTrue(actual.equals(expected));
    }
    @BeforeTest
    public void setUpMethod(){
        System.out.println("--> BeforeMethod is running!..");
    }

    @AfterTest
    public void tearDownMethod(){
        System.out.println("--> AfterMethod is running!..");
    }

    @BeforeClass
    public void setUpClass(){
        System.out.println("--> BeforeClass is running!..");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("--> AfterClass is running!..");
    }

}
