package com.loop.test.day5_testNg_dropdown;

import org.testng.Assert;
import org.testng.annotations.Test;

public class T00_TestNG_Intro_Continue {

    @Test
    public void test1(){
        System.out.println("TestNG test 1 is running");
        String actual = "Loop";
        String expected = "Loop";
        Assert.assertEquals(actual, expected, actual+ ": is not matching with: " + expected);
    }

    @Test
    public void test2(){
        System.out.println("TestNG test 2 is running");
    }


}

