package company.AUA;

import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class CCpayment extends company.Page {
    protected Properties props;

    public CCpayment(WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;


        //TODO this needs a page/URL check "Oklahoma Board of Nursing - AUAconfirmation"

        //TODO this needs a page/URL check "Oklahoma Board of Nursing - Nursing Renewal - Payment Type"
        findAndClick(this.props.getProperty("XccRadio"));//checks CC payment
        //TODO this needs a page/URL check "Oklahoma Board of Nursing - Enter Payment Information"
        findAndClick(this.props.getProperty("XoptionCont"));


        findAndClick(this.props.getProperty("ccContBlank"));//Sends blank form
        clearSend(this.props.getProperty("XccName"),this.props.getProperty("ccName"));//Name
        clearSend(this.props.getProperty("XccAddr"),this.props.getProperty("ccAddr"));//Addr
        clearSend(this.props.getProperty("XccCity"),this.props.getProperty("ccCity"));//City
        dropdown(this.props.getProperty("XccState"),this.props.getProperty("ccState"));//State
        clearSend(this.props.getProperty("XccZip"),this.props.getProperty("ccZip"));//Zip
        dropdown(this.props.getProperty("XccType"),this.props.getProperty("ccType"));//CC Type
        clearSend(this.props.getProperty("XccNumber"),this.props.getProperty("ccNumber"));//CC Number
        clearSend(this.props.getProperty("XccReNumber"),this.props.getProperty("ccReNumber"));//CC Number ReEntry
        clearSend(this.props.getProperty("XccSecCode"),this.props.getProperty("ccSecCode"));//Security Code
        dropdown(this.props.getProperty("XccExpDateMon"),this.props.getProperty("ccExpDateMon"));//Exp Month
        dropdown(this.props.getProperty("XccExpDateYear"),this.props.getProperty("ccExpDateYear"));//Exp Year
        findAndClick(this.props.getProperty("ccCont"));//Submits Payment





    }
}
