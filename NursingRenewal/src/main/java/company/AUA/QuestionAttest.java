package company.AUA;

import org.openqa.selenium.WebDriver;
import java.util.Properties;

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//TODO Check If you answered "YES" to Questions text
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

public class QuestionAttest extends company.Page {
    protected Properties props;

    public QuestionAttest (WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;
    if (driver.getPageSource().contains(this.props.getProperty("ArrestAttest_sc"))) {
        findAndClick(this.props.getProperty("XattestContinue"));

        }
    }
}
