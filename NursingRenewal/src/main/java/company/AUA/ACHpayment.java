package company.AUA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ACHpayment extends company.Page{
    protected Properties props;

    public ACHpayment (WebDriver driver,Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;


        //-----------Payment Type-----------------------------------------------
        findAndClick(this.props.getProperty("XselectACH"));//Choses ACH option
        findAndClick(this.props.getProperty("XcontFromPayType"));//Clicks continue
        //-----------Enter Payment Info-----------------------------------------
        clearSend(this.props.getProperty("XachName"),this.props.getProperty("achName"));//Name
        clearSend(this.props.getProperty("XbillingAddr"),this.props.getProperty("billingAddr"));//Addr
        clearSend(this.props.getProperty("XbillingCity"),this.props.getProperty("billingCity"));//City
        dropdown(this.props.getProperty("XbillingState"),this.props.getProperty("billingState"));//State
        clearSend(this.props.getProperty("XbillingZip"),this.props.getProperty("billingZip"));//Zip
        clearSend(this.props.getProperty("XroutingNumber"),this.props.getProperty("routingNumber"));//routing num
        clearSend(this.props.getProperty("XreRoutingNumber"),this.props.getProperty("reRoutingNumber"));//re-routing num
        clearSend(this.props.getProperty("XaccountNumber"),this.props.getProperty("accountNumber"));//account num
        this.driver.findElement(By.name("banknum2")).clear();
        this.driver.findElement(By.name("banknum2")).sendKeys(this.props.getProperty("reAccountNumber"));///re-account num
        findAndClick(this.props.getProperty("XachCont"));





    }

}
