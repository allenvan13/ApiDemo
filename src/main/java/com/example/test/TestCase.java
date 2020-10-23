package com.example.test;

import com.example.service.ReadExcel;
import org.testng.annotations.*;

@Test
public class TestCase {

    @Test
    public void test01(){
        System.out.println("test01-----------------------！");
        String excelName = "data.xlsx";


        System.out.println("test01-----------------------！");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest=========================!");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest=========================!");
    }

}
