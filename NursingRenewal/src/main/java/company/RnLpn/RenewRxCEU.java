package company.RnLpn;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class RenewRxCEU extends company.Page {
    protected Properties props;

    public RenewRxCEU(WebDriver driver, Properties propertiesObj) {
        this.driver = driver;
        this.props = propertiesObj;

        if (driver.getPageSource().contains(this.props.getProperty("RenewRxCEU_sc"))){
            clearSend(this.props.getProperty("XrenewRxCEUhours1"),this.props.getProperty("renewRxCEUhours1"));
            clearSend(this.props.getProperty("XrenewRxCEUhours2"),this.props.getProperty("renewRxCEUhours2"));
            findAndClick(this.props.getProperty("XrenewRxCEUcont"));




        }
    }
}