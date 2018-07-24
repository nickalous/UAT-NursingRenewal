package company.AUA;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Citizen extends company.Page {
    protected Properties props;

    public Citizen(WebDriver driver, Properties propertiesObj) {
        this.driver = driver;
        this.props = propertiesObj;
        if (driver.getPageSource().contains(this.props.getProperty("Citizen_sc"))) {
            dropdown(this.props.getProperty("XcitStatus"), this.props.getProperty("citBlank"));
            findAndClick(this.props.getProperty("XcitContinue"));
            /**
             int i = 0;
             while (i < 11) {
             String[] options;
             options = new String[12];
             options[0] = "Alien - Conditional Entry";
             options[1] = "Alien - Deportation Withheld";
             options[2] = "Alien - Subjected to Cruelty";
             options[3] = "Alien Paroled into US for 1 yr";
             options[4] = "Asylee";
             options[5] = "Cuban/Haitian Entrant";
             options[6] = "Immig or Nonimmig Visa Status";
             options[7] = "Other";
             options[8] = "Permanent Legal Resident Alien";
             options[9] = "Refugee";
             options[10] = "U.S. Citizen";
             options[11] = "National";

             dropdown("//*[@id=\"citizen_code\"]", options[i]);

             while (sourceCheck(" \n" +
             "Oklahoma Board of Nursing - Citizenship Affidavit / Main Menu"));

             }
             */
            dropdown(this.props.getProperty("XcitStatus"), this.props.getProperty("citStatus"));
            findAndClick(this.props.getProperty("XcitContinue"));
        }
    }
}