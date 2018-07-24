package company.RnLpn;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class RenewAprn extends company.Page{
    protected Properties props;

    public RenewAprn(WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;


        if(driver.getPageSource().contains(this.props.getProperty("RenewAPRN_sc"))){
            if (this.props.getProperty("APRN").equals("True")){
                findAndClick(this.props.getProperty("XrenewYes"));
                findAndClick(this.props.getProperty("XAprnCont"));


                }
            if (this.props.getProperty("APRN").equals("False")) {
                findAndClick(this.props.getProperty("XrenewNo"));
                findAndClick(this.props.getProperty("XAprnCont"));

            }
        }
    }
}
