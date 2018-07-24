package company.Admin;

import company.Page;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ProcessPendingRenewal extends Page {
    protected Properties props;

    public ProcessPendingRenewal(WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;
        findAndClick(this.props.getProperty("XprocessPendingRenewal"));

        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();

        // Perform the click operation that opens new window
        findInTable(this.props.getProperty("verifyLicNum"));

        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        // Perform the actions on new window
        compare(this.props.getProperty("XProcessPersonalAddr"), this.props.getProperty("personalAddress"));
        compare(this.props.getProperty("XProcessPersonalAddr2"), this.props.getProperty("personalAddressCont"));
        //compare(this.props.getProperty("XProcessPersonalCity"), this.props.getProperty("personalCity"));
        compare(this.props.getProperty("XProcessPersonalZip"), this.props.getProperty("personalZip")+ " -");
        compare(this.props.getProperty("XProcessPersonalPhoneD"), this.props.getProperty("persoanlDayPhone"));
        compare(this.props.getProperty("XProcessPersonalPhoneE"), this.props.getProperty("personalEveningPhone"));
        compare(this.props.getProperty("XProcessPersonalEmail"), this.props.getProperty("personalEmail"));
        compare(this.props.getProperty("XProcessPracticeEmployedIn"), this.props.getProperty("employedin"));
        compare(this.props.getProperty("XProcessPracticeFieldOf"), this.props.getProperty("practiceOther"));
        compare(this.props.getProperty("XProcessPracticeTypeOf"), this.props.getProperty("posOther"));
        compare(this.props.getProperty("XProcessPracticeSpecialty"), this.props.getProperty("specialtyOther"));
        compare(this.props.getProperty("XProcessEmployerName"), this.props.getProperty("empName"));
        compare(this.props.getProperty("XProcessEmployerAddr1"), this.props.getProperty("empAddr"));
        compare(this.props.getProperty("XProcessEmployerCity"), this.props.getProperty("empCity"));
        //compare(this.props.getProperty("XProcessEmployerState"), this.props.getProperty("empState"));
        compare(this.props.getProperty("XProcessEmployerZip"), this.props.getProperty("empZip"));

        // Close the new window, if that window no more required
        driver.close();

        // Switch back to original browser (first window)
        driver.switchTo().window(winHandleBefore);

        // Find the record in table and select it
        //findAndClick(this.props.getProperty("XprocessPendingCheckBox"));

        // Process Renewal
        //findAndClick("//*[@id=\"process_renewals_tpl_fr1\"]/div/input");

        // Return to Admin Menu
        //findAndClick("/html/body/table[2]/tbody/tr[1]/td[2]/div/div[2]/a[2]");

        findAndClick(this.props.getProperty("XhomeMenu"));
}
}
