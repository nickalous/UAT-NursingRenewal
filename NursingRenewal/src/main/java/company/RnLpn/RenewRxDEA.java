package company.RnLpn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class RenewRxDEA extends company.Page {
    protected Properties props;

    public RenewRxDEA(WebDriver driver, Properties propertiesObj) {
        this.driver = driver;
        this.props = propertiesObj;

        if (driver.getPageSource().contains(this.props.getProperty("Dea_sc"))) {
            findAndClick(this.props.getProperty("XdeaRegYes"));
            this.driver.findElement(By.xpath(this.props.getProperty("XdeaNum"))).sendKeys("123456");
            findAndClick(this.props.getProperty("XdeaCont"));




        }
    }
    }