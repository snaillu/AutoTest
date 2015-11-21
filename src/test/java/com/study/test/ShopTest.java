package com.study.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by snail on 11/21/15.
 */
public class ShopTest {
    @BeforeTest
    public void beforeTest(){
        write(3,3,"2015-11-21");
    }

    @Test
    public void test(){
        System.out.print("OK");
    }

    @Test
    public void test1(){
        System.out.print("OK1");
    }

    @AfterTest
    public void afterTest(){
        write(5,3,"00:01:11");
        write(6,3,"11");

    }

    public void write(int row,int colomn,String value){}
}
