package company.AUA;
import org.openqa.selenium.WebDriver;

import java.util.Properties;
//https://etsstg.www.ok.gov/nursing/verify/
public class Verify extends company.Page{
    protected Properties props;

    public Verify (WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;




        this.driver.get("https://migration:migrationtest@etsstg.www.ok.gov/nursing/verify/");

        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        // Perform the actions on new window
        dropdown(this.props.getProperty("XverifyLicTypeDropdown"),this.props.getProperty("verifyLicTypeDropdown"));
        clearSend(this.props.getProperty("XverifyLicNum"),this.props.getProperty("verifyLicNum"));
        findAndClick("/html/body/table[2]/tbody/tr[1]/td[2]/div/form/table/tbody/tr[6]/td[2]/input");

        String Name;

        printField(this.props.getProperty("XverifyName"));//name
        printField(this.props.getProperty("XverifyLicType"));//lic type
        printField(this.props.getProperty("XverifyAprn-Rx"));//aprn info
        printField(this.props.getProperty("XverifyLicStatus"));//License Status
        printField(this.props.getProperty("XverifyExpDate"));//Expiration Date

    }

}
