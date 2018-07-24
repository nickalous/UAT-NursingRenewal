package company.RnLpn;

import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class RnLpnPsor extends company.Page {
    protected Properties props;

    public RnLpnPsor(WebDriver driver, Properties propertiesObj) {
        this.driver = driver;
        this.props = propertiesObj;

        if (driver.getPageSource().contains(this.props.getProperty("PSOR_sc"))) {

            if (this.props.getProperty("PSORchoice").equals("1")) {     //  I declare Oklahoma as my primary state of residence
                findAndClick(this.props.getProperty("Xpsor1"));      //   and I have provided an Oklahoma address.
            }
            if (this.props.getProperty("PSORchoice").equals("2")) {     //  I declare Oklahoma as my primary state of residence
                findAndClick(this.props.getProperty("Xpsor2"));      // but I have not provided an Oklahoma address.
            }
            if (this.props.getProperty("PSORchoice").equals("3")) {     // I am declaring a Non-Compact state as my primary
                findAndClick(this.props.getProperty("Xpsor3"));      //  state of residence.
            }
            if (this.props.getProperty("PSORchoice").equals("4")) {     // I am declaring another Compact state as
                findAndClick(this.props.getProperty("Xpsor4"));      // my primary state of residence.
            }
            findAndClick(this.props.getProperty("XpsorCont"));       // Submits PSOR

            if (driver.getPageSource().contains(this.props.getProperty("PSORopt3_sc"))){

                findAndClick(this.props.getProperty("Xopt3_cont"));

            }
        }

    }

}

