package company.Admin;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class AdminMenu extends company.Page{
    protected Properties props;

    public AdminMenu (WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;

        if(!this.props.getProperty("PSORchoice").equals( "1")){
            new ProcessPendingRenewal(this.driver, this.props);
            //TODO find record in table and process it
        }
        else {
            new OpenRecords(this.driver, this.props);
        }
    }
}
