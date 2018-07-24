package company.AUA;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class AUAlogin extends company.Page{
    protected Properties props;

    public AUAlogin (WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;
        this.driver.get("https://migration:migrationtest@etsstg.www.ok.gov/nursing/renewal/login.php");
        clearSend(this.props.getProperty("XverifyLicNum"),this.props.getProperty("verifyLicNum"));
        dropdown(this.props.getProperty("XverifyLicTypeDropdown"),this.props.getProperty("verifyLicTypeDropdown"));
        clearSend(this.props.getProperty("Xpin"),this.props.getProperty("pin"));
        findAndClick("/html/body/table[2]/tbody/tr[1]/td[2]/div/form/table/tbody/tr[5]/td[2]/input");
        clearSend(this.props.getProperty("XsecQ1"), this.props.getProperty("secQanswer"));
        clearSend(this.props.getProperty("XsecQ2"), this.props.getProperty("secQanswer"));
        findAndClick("/html/body/table[2]/tbody/tr[1]/td[2]/div/form/table/tbody/tr[4]/td[2]/input");
        findAndClick("/html/body/table[2]/tbody/tr[1]/td[2]/div/div[6]/form/input");


    }

}
