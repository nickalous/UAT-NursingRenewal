package company.AUA;

import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class EmployerInfo extends company.Page {
    protected Properties props;

    public EmployerInfo (WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;

        if(driver.getPageSource().contains(this.props.getProperty("EmployerInformation_sc"))){

        empty(this.props.getProperty("XempName"));//Employer Name -- SEND BLANK
        empty(this.props.getProperty("XempAddr"));//Employer Address -- SEND BLANK
        empty(this.props.getProperty("XempAddrCont"));//Employer Address cont.. -- SEND BLANK
        empty(this.props.getProperty("XempCity"));//Employer City -- SEND BLANK
        dropdown(this.props.getProperty("XempState"),"AA");//Employer State -- SEND BLANK
        dropdown(this.props.getProperty("XempCountry"),"Aruba");//Employer Country -- SEND BLANK
        empty(this.props.getProperty("XempZip"));//Employer Zip -- SEND BLANK
        findAndClick(this.props.getProperty("XempCont"));//Continue



        clearSend(this.props.getProperty("XempName"),this.props.getProperty("empName"));//Employer Name
        clearSend(this.props.getProperty("XempAddr"),this.props.getProperty("empAddr"));//Employer Address
        clearSend(this.props.getProperty("XempAddrCont"),this.props.getProperty("empAddrCont"));//Employer Address cont..
        clearSend(this.props.getProperty("XempCity"),this.props.getProperty("empCity"));//Employer City
        dropdown(this.props.getProperty("XempState"),this.props.getProperty("empState"));//Employer State
        dropdown(this.props.getProperty("XempCountry"),this.props.getProperty("empCountry"));//Employer Country
        clearSend(this.props.getProperty("XempZip"),this.props.getProperty("empZip"));//Employer Zip
        findAndClick(this.props.getProperty("XempCont"));//Continue

    }

    }
}
