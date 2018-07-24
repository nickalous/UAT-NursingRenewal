package company.RnLpn;
import org.openqa.selenium.WebDriver;

import java.util.Properties;
//https://etsstg.www.ok.gov/nursing/verify/
public class RnLpnVerify extends company.Page{
    protected Properties props;

    public RnLpnVerify (WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;




        this.driver.get("https://migration:migrationtest@etsqa.www.ok.gov/nursing/verify/");

        if(driver.getPageSource().contains("Oklahoma Board of Nursing - Nursing License Verification")){

        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        // Perform the actions on new window
        dropdown(this.props.getProperty("XverifyLicTypeDropdown"),this.props.getProperty("verifyLicTypeDropdown"));
        clearSend(this.props.getProperty("XverifyLicNum"),this.props.getProperty("verifyLicNum"));
        findAndClick("/html/body/table[2]/tbody/tr[1]/td[2]/div/form/table/tbody/tr[6]/td[2]/input");

        printField(this.props.getProperty("XverifyName"));//name
        printField(this.props.getProperty("XverifyLicType"));//lic type
        printField(this.props.getProperty("XverifyAprn-Rx"));//aprn info
        //printField(this.props.getProperty("XverifyLicStatus"));//License Status
        //printField(this.props.getProperty("XverifyExpDate"));//Expiration Date


       String AprnOrRx = findAndSave(this.props.getProperty("XverifyAprn-Rx"));





    }
    }

}
