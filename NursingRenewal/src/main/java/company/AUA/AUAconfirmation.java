package company.AUA;

import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class AUAconfirmation extends company.Page {
    protected Properties props;

    public AUAconfirmation(WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;

        Boolean Arrest_Hold = Boolean.parseBoolean(this.props.getProperty("ArrestHold"));
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//TODO Accommodate for the use case of not wanting an arrest hold
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------





        //---------------Personal Info----------------------------------------------------------------------------------
        compare(this.props.getProperty("XconfLicNum"),this.props.getProperty("verifyLicNum"));//License Number
        compare(this.props.getProperty("XconfLicType"),this.props.getProperty("verifyLicTypeDropdown"));//License Type
        compare(this.props.getProperty("XconfAddress"),this.props.getProperty("personalAddress"));//Address
        compare(this.props.getProperty("XconfAddressCont"),this.props.getProperty("personalAddressCont"));//Address Continued
        compare(this.props.getProperty("XconfState"),this.props.getProperty("personalState"));//State
        compare(this.props.getProperty("XconfDaytimePhone"),this.props.getProperty("persoanlDayPhone"));//Daytime Phone
        compare(this.props.getProperty("XconfEveningPhone"),this.props.getProperty("personalEveningPhone"));//Evening Phone
        compare(this.props.getProperty("XconfEmail"),this.props.getProperty("personalEmail"));//Email
        //---------------Arrest Q's-------------------------------------------------------------------------------------
        if(Arrest_Hold == true) {
            compare(this.props.getProperty("XconfArrestQ1"), this.props.getProperty("ArrestQ1Text"));//Arrest Q1 Answer
            compare(this.props.getProperty("XconfArrestQ2"), this.props.getProperty("ArrestQ2Text"));//Arrest Q2 Answer
            compare(this.props.getProperty("XconfArrestQ3"), this.props.getProperty("ArrestQ3Text"));//Arrest Q3 Answer
            compare(this.props.getProperty("XconfArrestQ4"), this.props.getProperty("ArrestQ4Text"));//Arrest Q4 Answer
        }
        //---------------Practice Details-------------------------------------------------------------------------------
        compare(this.props.getProperty("XconfEmpIn"),this.props.getProperty("employedAs"));//Employed in Nursing
        compare(this.props.getProperty("XconfField"),this.props.getProperty("practiceOther"));//Field of Employment
        //---------------Employer Info----------------------------------------------------------------------------------
        compare(this.props.getProperty("XconfEmpName"),this.props.getProperty("empName"));//Employer Name
        compare(this.props.getProperty("XconfEmpAddr1"),this.props.getProperty("empAddr"));//Employer Address
        compare(this.props.getProperty("XconfEmpAddr2"),this.props.getProperty("empAddrCont"));//Employer Address Cont..
        compare(this.props.getProperty("XconfEmpCity"),this.props.getProperty("empCity"));//Employer City
        compare(this.props.getProperty("XconfEmpZip"),this.props.getProperty("empZip"));//Employer Zip
        //---------------Citizenship------------------------------------------------------------------------------------
        compare(this.props.getProperty("XconfCitizenship"),"Citizenship Status: "+this.props.getProperty("citStatus"));
        //---------------Ethnicity--------------------------------------------------------------------------------------
        compare(this.props.getProperty("XconfEthnicity"),"Ethnicity: " + this.props.getProperty("EthnicityChoice"));//Ethnicity
        //---------------Verification of Continuing Qualifications------------------------------------------------------
        compare(this.props.getProperty("XconfVerif"),"Eligibility for renewal of your certification: " +this.props.getProperty("VerifText1"));//Verification of Continuing Qualifications

        findAndClick(this.props.getProperty("XcontToACH"));// Continues from Verification to Payment
    }
}
