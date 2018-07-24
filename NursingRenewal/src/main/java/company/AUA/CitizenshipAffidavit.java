package company.AUA;
import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class CitizenshipAffidavit extends company.Page{
    protected Properties props;

    public CitizenshipAffidavit (WebDriver driver, Properties propertiesObj) {
        this.driver = driver;
        this.props = propertiesObj;
        if (driver.getPageSource().contains(this.props.getProperty("CitizenAff_sc"))) {
            findAndClick(this.props.getProperty("XaffidavitContinue"));
            findAndClick(this.props.getProperty("XdoCert"));
            findAndClick(this.props.getProperty("XaffidavitContinue"));
        }
    }
}
