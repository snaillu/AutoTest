package com.study.test;

import com.study.autotest.entity.TestResult;
import com.study.autotest.utils.WriteResultUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by snail on 11/21/15.
 */
public class UserTest {
    private TestResult result = new TestResult();
    private String filePath = "/home/snail/test/result-userTest.xls";

    @BeforeTest
    public void beforeTest(){
        result.setDate("2015-11-21");
        result.setStartTime("21:21:11");
    }

    @Test
    public void test(){
        System.out.print("OK");


        result.addTestItem("UserTest.test","PASS","this is test.\nThis is new line.");
    }

    @Test
    public void test1(){
        System.out.print("OK1");

        result.addTestItem("UserTest.test1","PASS","Hello,World.");
    }

    @AfterTest
    public void afterTest(){
        result.setEndTime("21:31:11");
        result.setTotalCount("2");
        result.setPassCount("2");
        result.setFailCount("0");
        result.setDuration("00:10:00");

        WriteResultUtils utils = new WriteResultUtils();
        utils.writeResultSummary(result,filePath);

    }

}
