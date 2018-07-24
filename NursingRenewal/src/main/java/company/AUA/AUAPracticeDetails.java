package company.AUA;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class AUAPracticeDetails extends company.Page{
    protected Properties props;

    public AUAPracticeDetails(WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;

        if (driver.getPageSource().contains(this.props.getProperty("PracticeDetails_sc"))) {
            dropdown(this.props.getProperty("XemployedAs"), this.props.getProperty("employedAs"));
            dropdown(this.props.getProperty("XfieldOfEmploy"), this.props.getProperty("fieldOfEmploy"));
            clearSend(this.props.getProperty("XpracticeOther"), this.props.getProperty("practiceOther"));
            findAndClick(this.props.getProperty("XpracticeDetailCont"));

        }
    }
}
