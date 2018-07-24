package company.AUA;

import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class Ethnicity extends company.Page {
    protected Properties props;

    public Ethnicity (WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;
    if (driver.getPageSource().contains(this.props.getProperty("Ethnicity_sc"))) {
        dropdown(this.props.getProperty("Xethnicity"), this.props.getProperty("EthnicityBlank"));
        dropdown(this.props.getProperty("Xethnicity"), this.props.getProperty("EthnicityChoice"));
        findAndClick(this.props.getProperty("XethnicityContinue"));


        }
    }
}
