package com.study.autotest.test;

import com.study.autotest.entity.TestResult;
import com.study.autotest.utils.WriteResultUtils;

/**
 * Created by snail on 11/21/15.
 */
public class Client {
    public static void main(String[] args){
        TestResult summary = new TestResult();
        summary.setDate("2015-11-20");
        summary.setStartTime("07:20:00");
        summary.setEndTime("07:30:21");
        summary.setDuration("00:10:21");
        summary.setTotalCount("11");
        summary.setPassCount("10");
        summary.setFailCount("1");
        String filePath = "/home/snail/test/result-002.xls";




        WriteResultUtils utils = new WriteResultUtils();
        utils.writeResultSummary(summary,filePath);
    }
}
