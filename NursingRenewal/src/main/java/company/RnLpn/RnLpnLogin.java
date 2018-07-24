package company.RnLpn;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class RnLpnLogin  extends company.Page{
    protected Properties props;

        public RnLpnLogin (WebDriver driver, Properties propertiesObj){
            this.driver = driver;
            this.props = propertiesObj;

            this.driver.get(this.props.getProperty("RnLpnUrl"));//calls login page
            if(driver.getPageSource().contains(this.props.getProperty("Login_sc"))) {
                clearSend(this.props.getProperty("XverifyLicNum"), this.props.getProperty("verifyLicNum"));//Sends Lic Num
                dropdown(this.props.getProperty("XverifyLicTypeDropdown"), this.props.getProperty("verifyLicTypeDropdown"));//Selects Lic Type
                clearSend(this.props.getProperty("Xpin"), this.props.getProperty("pin"));//Enters Pin
                findAndClick(this.props.getProperty("XsubmitPin"));//Submit pin
            }
            if(driver.getPageSource().contains(this.props.getProperty("SecQ_sc"))) {
                clearSend(this.props.getProperty("XsecQ1"), this.props.getProperty("secQanswer"));//SecQ 1
                clearSend(this.props.getProperty("XsecQ2"), this.props.getProperty("secQanswer"));//SecQ 2
                findAndClick(this.props.getProperty("XsubmitSecQ"));//Sec Q Submit
            }
            if(driver.getPageSource().contains(this.props.getProperty("MainMenu_sc"))) {
                findAndClick(this.props.getProperty("XclickRenew"));//Click Renew
                findAndClick(this.props.getProperty("XpopUpNo"));//no option
                findAndClick(this.props.getProperty("XpopUpCont"));//continue
            }



        }

    }

