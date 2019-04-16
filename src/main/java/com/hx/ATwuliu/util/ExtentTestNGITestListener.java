package com.hx.ATwuliu.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ResourceCDN;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.util.List;

import static com.hx.ATwuliu.util.InitPre.driver;
import static jdk.nashorn.internal.objects.NativeDate.getTime;

/**
 * Created by Administrator on 2019/4/15.
 */
public class ExtentTestNGITestListener implements ITestListener {

    private static final String OUTPUT_FOLDER="test-output/";
    private static final String FILE_NAME="extent.html";
    private static final String REPORT_NAME = "德清出入库自动化测试";
    private static ExtentReports extent = ExtentManager.createInstance(OUTPUT_FOLDER + FILE_NAME);
    private static ThreadLocal parentTest = new ThreadLocal();
    private static ThreadLocal test = new ThreadLocal();



    @Override
    public synchronized void onStart(ITestContext context) {
        File reportDir= new File(OUTPUT_FOLDER);
        if(!reportDir.exists()&& !reportDir .isDirectory()){
            reportDir.mkdir();
        }
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(OUTPUT_FOLDER + FILE_NAME);
        // 设置静态文件的DNS
        //怎么样解决cdn.rawgit.com访问不了的情况
        htmlReporter.config().setResourceCDN(ResourceCDN.EXTENTREPORTS);

        htmlReporter.config().setDocumentTitle(REPORT_NAME);
        htmlReporter.config().setReportName(REPORT_NAME);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setCSS(".node.level-1  ul{ display:none;} .node.level-1.active ul{display:block;}");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setReportUsesManualConfiguration(true);
    }

    @Override
    public synchronized void onFinish(ITestContext context) {
        extent.flush();
    }


    @Override
    public synchronized void onTestStart(ITestResult result) {
        test.set(extent.createTest(result.getMethod().getMethodName()));
    }

    @Override
    public synchronized void onTestSuccess(ITestResult result) {
        ((ExtentTest)test.get()).pass("Test passed");
        //test.log(status, "Test " + status.toString().toLowerCase() + "ed");
    }

    @Override
    public synchronized void onTestFailure(ITestResult result) {
        ((ExtentTest)test.get()).fail(result.getThrowable());
        File directory = new File("test-output");
        try {
            String screenPath = directory.getCanonicalPath() + "/";
            File file = new File(screenPath);
            if (!file.exists()){
                file.mkdirs();
            }
            String fileName = result.getMethod().getMethodName() + ".png";
            //driver.saveScreenshot(screenPath + fileName);
            ((ExtentTest)test.get()).addScreenCaptureFromPath(screenPath + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void onTestSkipped(ITestResult result) {
        ((ExtentTest)test.get()).skip(result.getThrowable());
    }

    @Override
    public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }
}


