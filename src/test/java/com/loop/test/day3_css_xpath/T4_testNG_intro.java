package com.loop.test.day3_css_xpath;

import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_testNG_intro {



        @Test
        public void test1() {
            System.out.println("TestNG is running");
            String actual = "Feyruz";
            String expected = "Feyruz";

            Assert.assertEquals(actual, expected);
        }
}
