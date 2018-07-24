package company.AUA;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ACHverify extends company.Page{
    protected Properties props;

    public ACHverify(WebDriver driver,Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;

        compare(this.props.getProperty("XachVerifName"),this.props.getProperty("achName"));//name
        compare(this.props.getProperty("XachVerifaddr"),this.props.getProperty("billingAddr"));//addr
        compare(this.props.getProperty("XachVerifCity"),this.props.getProperty("billingCity"));//city
        compare(this.props.getProperty("XachVerifState"),this.props.getProperty("billingState"));//state
        compare(this.props.getProperty("XachVerifZip"),this.props.getProperty("billingZip"));//Zip
        compare(this.props.getProperty("XroutLastFour"),this.props.getProperty("accntLastFour"));//Routing Last Four
        compare(this.props.getProperty("xAccntReLastFour"),this.props.getProperty("AccntReLastFour"));//Account Last Four
        findAndClick("//*[@id=\"payment_button\"]"); //TODO this completes the payment
    }





}
