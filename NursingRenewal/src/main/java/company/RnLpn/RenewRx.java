package company.RnLpn;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class RenewRx extends company.Page{
    protected Properties props;

    public RenewRx (WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;

        if(driver.getPageSource().contains(this.props.getProperty("RenewRX_sc"))){
            if (this.props.getProperty("RX").equals("True")){
                findAndClick(this.props.getProperty("XrenewRxYes"));
                findAndClick(this.props.getProperty("XrenewRxCont"));
            }
            if (this.props.getProperty("RX").equals("False")){
                findAndClick(this.props.getProperty("XrenewRxNo"));
                findAndClick(this.props.getProperty("XrenewRxCont"));

            }
        }
    }
}
