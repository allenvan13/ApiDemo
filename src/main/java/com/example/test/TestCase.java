package com.example.test;

import org.testng.annotations.*;

@Test
public class TestCase {

    @Test
    public void test01(){
        System.out.println("test01-----------------------！");
    }

    @Test
    public void test02(){
        System.out.println("test02-----------------------！");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest=========================!");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite=========================!");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass=========================!");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod=========================!");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest=========================!");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite=========================!");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass=========================!");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod=========================!");
    }
}
