package company.Admin;

import company.Page;
import org.openqa.selenium.WebDriver;
import java.util.Properties;



public class AdminLogin extends Page {
    protected Properties props;

    public AdminLogin (WebDriver driver,Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;

        this.driver.get(this.props.getProperty("AdminURL"));//calls Login Page

        clearSend(this.props.getProperty("Xlogin"),this.props.getProperty("login"));
        clearSend(this.props.getProperty("Xpass"),this.props.getProperty("pass"));
        findAndClick(this.props.getProperty("Xlogin_cont"));

    }
}
