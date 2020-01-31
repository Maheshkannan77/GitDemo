package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;

public class ExtentReportDemo {
    public WebDriver driver;

    ExtentTest test;
    ExtentReports extent;


    public void getAvent() {

        ExtentReports extent = new ExtentReports();
        ExtentHtmlReporter report = new ExtentHtmlReporter("D:\\ExtentReport.html");
        extent.attachReporter(report);

        ExtentTest test = extent.createTest("FirstName");

        test.log(Status.PASS,"Pass");
        test.pass("Pass");
        extent.flush();



    }


    }
