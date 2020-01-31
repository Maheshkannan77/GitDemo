import extentReport.ExtentReportDemo;
import org.junit.Test;

public class TestCall {

    @Test
    public void test(){
        System.out.print("Reporter start");
        ExtentReportDemo report = new ExtentReportDemo();
        report.getAvent();
    }
}
