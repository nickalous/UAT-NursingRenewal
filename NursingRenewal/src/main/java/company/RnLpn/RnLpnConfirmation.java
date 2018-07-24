package company.RnLpn;

        import org.openqa.selenium.WebDriver;
        import java.util.Properties;

public class RnLpnConfirmation extends company.Page {
    protected Properties props;

    public RnLpnConfirmation (WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;

        if(driver.getPageSource().contains(this.props.getProperty("RnLpnConfirmation_sc"))) {





            findAndClick(this.props.getProperty("RnLpnConfirmation_cont"));//Continues from Verification


        }
        }
    }