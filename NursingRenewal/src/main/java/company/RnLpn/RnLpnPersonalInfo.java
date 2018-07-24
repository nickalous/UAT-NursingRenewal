package company.RnLpn;

import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class RnLpnPersonalInfo extends company.Page{
    protected Properties props;

    public RnLpnPersonalInfo (WebDriver driver,Properties propertiesObj) {
        this.driver = driver;
        this.props = propertiesObj;
       // if (driver.getPageSource().contains(this.props.getProperty("PersonalInformation_sc"))) {
            empty(this.props.getProperty("XpersonalAddress"));//Clears the Mailing Address
            empty(this.props.getProperty("XpersonalAddressCont"));//Clears the Mailing Address Cont..
            //empty(this.props.getProperty("XpersonalCity"));//Clears the City
            //empty(this.props.getProperty(""));//Clears the State - DropDown
            //empty(this.props.getProperty(""));//Clears the Country - DropDown
            empty(this.props.getProperty("XpersonalZip"));//Clears the Zip
            empty(this.props.getProperty("XpersoanlDayPhone"));//Clears the Daytime Phone
            empty(this.props.getProperty("XpersonalEveningPhone"));//Clears the Evening Phone
            empty(this.props.getProperty("XpersonalEmail"));//Clears the Email
            findAndClick(this.props.getProperty("XpersonalInfoCont"));// Submits empty form

            clearSend(this.props.getProperty("XpersonalAddress"), this.props.getProperty("personalAddress"));//Mailing Address
            clearSend(this.props.getProperty("XpersonalAddressCont"), this.props.getProperty("personalAddressCont"));//Mailing Address Cont..
            //clearSend(this.props.getProperty("XpersonalCity"),this.props.getProperty("personalCity"));//City
            dropdown(this.props.getProperty("XpersonalState"), this.props.getProperty("personalState"));//State - DropDown
            //dropdown(this.props.getProperty("XpersonalCountry"),this.props.getProperty("personalCountry"));//Country - DropDown
            clearSend(this.props.getProperty("XpersonalZip"), this.props.getProperty("personalZip"));//Zip
            clearSend(this.props.getProperty("XpersoanlDayPhone"), this.props.getProperty("persoanlDayPhone"));//Daytime Phone
            clearSend(this.props.getProperty("XpersonalEveningPhone"), this.props.getProperty("personalEveningPhone"));//Evening Phone
            clearSend(this.props.getProperty("XpersonalEmail"), this.props.getProperty("personalEmail"));//Email
            findAndClick(this.props.getProperty("XpersonalInfoCont"));

        }
    }

//}
