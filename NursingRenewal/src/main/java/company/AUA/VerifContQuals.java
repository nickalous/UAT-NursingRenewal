package company.AUA;

import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class VerifContQuals extends company.Page {
    protected Properties props;

    public VerifContQuals(WebDriver driver, Properties propertiesObj) {
        this.driver = driver;
        this.props = propertiesObj;
        if (driver.getPageSource().contains(this.props.getProperty("VerifContQuals_sc"))) {

            if (this.props.getProperty("PSORchoice").equals("3")) {
                findAndClick(this.props.getProperty("Xchoice4"));
                findAndClick(this.props.getProperty("XcontQualCont"));
                findAndClick(this.props.getProperty("Xarrest4Qback"));
                findAndClick(this.props.getProperty("Xchoice3"));
                findAndClick(this.props.getProperty("XcontQualCont"));
                findAndClick(this.props.getProperty("Xarrest4Qback"));
                findAndClick(this.props.getProperty("Xchoice2"));
                findAndClick(this.props.getProperty("XcontQualCont"));
                findAndClick(this.props.getProperty("Xarrest4Qback"));
                findAndClick(this.props.getProperty("Xchoice1"));
                findAndClick(this.props.getProperty("XcontQualCont"));


            } else {
                findAndClick(this.props.getProperty("Xchoice4"));
                findAndClick(this.props.getProperty("XcontQualCont"));
                findAndClick(this.props.getProperty("Xarrest5Qback"));
                findAndClick(this.props.getProperty("Xchoice3"));
                findAndClick(this.props.getProperty("XcontQualCont"));
                findAndClick(this.props.getProperty("Xarrest5Qback"));
                findAndClick(this.props.getProperty("Xchoice2"));
                findAndClick(this.props.getProperty("XcontQualCont"));
                findAndClick(this.props.getProperty("Xarrest5Qback"));
                findAndClick(this.props.getProperty("Xchoice1"));
                findAndClick(this.props.getProperty("XcontQualCont"));
            }
        }
    }
}

