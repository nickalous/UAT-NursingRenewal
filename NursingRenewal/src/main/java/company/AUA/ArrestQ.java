package company.AUA;

import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class ArrestQ extends company.Page {
    protected Properties props;

    public ArrestQ (WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;
    if (driver.getPageSource().contains(this.props.getProperty("ArrestQ_sc"))){
        Boolean Arrest_Hold = Boolean.parseBoolean(this.props.getProperty("ArrestHold"));

        //--------------------------------------------------------------------------------------------------------------
        //-----------------------------------Arrest Q Hold--------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------------------
        if (Arrest_Hold == true){
            findAndClick(this.props.getProperty("XarrestQ1True"));
            clearSend(this.props.getProperty("XArrestQ1Text"),this.props.getProperty("ArrestQ1Text"));
            findAndClick(this.props.getProperty("XarrestQ2True"));
            clearSend(this.props.getProperty("XArrestQ2Text"),this.props.getProperty("ArrestQ2Text"));
            findAndClick(this.props.getProperty("XarrestQ3True"));
            clearSend(this.props.getProperty("XArrestQ3Text"),this.props.getProperty("ArrestQ3Text"));
            findAndClick(this.props.getProperty("XarrestQ4True"));
            clearSend(this.props.getProperty("XArrestQ4Text"),this.props.getProperty("ArrestQ4Text"));
        if (driver.getPageSource().contains(this.props.getProperty("Q5_sc"))){
            findAndClick(this.props.getProperty("XarrestQ5True"));
            clearSend(this.props.getProperty("XArrestQ5Text"),this.props.getProperty("ArrestQ5Text"));
        }}
        //--------------------------------------------------------------------------------------------------------------
        //-----------------------------------'NO'Arrest Q Hold----------------------------------------------------------
        //--------------------------------------------------------------------------------------------------------------
        if (Arrest_Hold == false) {
            findAndClick(this.props.getProperty("XarrestQ1False"));
            findAndClick(this.props.getProperty("XarrestQ2False"));
            findAndClick(this.props.getProperty("XarrestQ3False"));
            findAndClick(this.props.getProperty("XarrestQ4False"));
            if (driver.getPageSource().contains(this.props.getProperty("Q5_sc"))){
                findAndClick(this.props.getProperty("XarrestQ5False"));}


        }

        if (driver.getPageSource().contains(this.props.getProperty("Q5_sc"))){
            findAndClick(this.props.getProperty("Xarrest5Qcont"));}
        else {
            findAndClick(this.props.getProperty("Xarrest4Qcont"));}
        }
    }
}
