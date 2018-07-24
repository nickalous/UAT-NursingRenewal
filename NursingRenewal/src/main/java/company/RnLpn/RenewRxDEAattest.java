package company.RnLpn;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class RenewRxDEAattest extends company.Page {
    protected Properties props;

    public RenewRxDEAattest(WebDriver driver, Properties propertiesObj) {
        this.driver = driver;
        this.props = propertiesObj;

        if (driver.getPageSource().contains(this.props.getProperty("DeaAttest_sc"))) {
            findAndClick(this.props.getProperty("XdeaAttestCont"));
            }
    }
    }