package company.RnLpn;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class RenewRx2 extends company.Page {
    protected Properties props;

    public RenewRx2(WebDriver driver, Properties propertiesObj) {
        this.driver = driver;
        this.props = propertiesObj;

        if (driver.getPageSource().contains(this.props.getProperty("RenewRX2_sc"))) {
            findAndClick(this.props.getProperty("XrenewRx2Current"));
            findAndClick(this.props.getProperty("XrenewRx2Cont"));

        }
    }
}