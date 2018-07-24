package company.AUA;

import org.openqa.selenium.WebDriver;
import java.util.Properties;

//TODO add License type price, OI fee, and total validation

public class CCpaymentVerify extends company.Page{
    protected Properties props;

    public CCpaymentVerify(WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;

        compare(this.props.getProperty("XpaymentName"),this.props.getProperty("ccName"));//Name
        compare(this.props.getProperty("Xpaymentaddr"),this.props.getProperty("ccAddr"));//Addr
        compare(this.props.getProperty("XpaymentCity"),this.props.getProperty("ccCity"));//City
        compare(this.props.getProperty("XpaymentState"),this.props.getProperty("ccState"));//State
        compare(this.props.getProperty("XpaymentZip"),this.props.getProperty("ccZip"));//Zip
    }
}
