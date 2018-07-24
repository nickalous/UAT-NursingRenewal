package company.RnLpn;

import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class RenewAprn2 extends company.Page{
    protected Properties props;

    public RenewAprn2 (WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;

        if(driver.getPageSource().contains(this.props.getProperty("RenewAPRN2_sc"))){
            if(this.props.getProperty("APRN").equals("True")){
                clearSend(this.props.getProperty("XexpDate"),this.props.getProperty("expDate"));
                findAndClick(this.props.getProperty("XiDoCert"));
                findAndClick(this.props.getProperty("Xaprn2Cont"));
            }
        }
    }
}
