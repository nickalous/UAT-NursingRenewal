package company.Admin;

import company.Page;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class OpenRecords extends Page {
    protected Properties props;

    public OpenRecords(WebDriver driver, Properties propertiesObj) {
        this.driver = driver;
        this.props = propertiesObj;

        findAndClick(this.props.getProperty("XmainMenuOpenRecords"));

        dropdown(this.props.getProperty("XopenRecordLicType"),this.props.getProperty("verifyLicTypeDropdown"));
        clearSend(this.props.getProperty("XopenRecordLicNum"),this.props.getProperty("verifyLicNum"));
        clearSend(this.props.getProperty("XopenRecordDate1"),this.props.getProperty("OpenRecordDate1"));
        clearSend(this.props.getProperty("XopenRecordDate2"),this.props.getProperty("OpenRecordDate2"));
        findAndClick(this.props.getProperty("XopenRecordSearch"));

        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();
        // Perform the click operation that opens new window
        findAndClick(this.props.getProperty("XviewOpenRecord"));
        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        //-------Open Record Verification---------------------------------
        compare(this.props.getProperty("XorLicNum"),this.props.getProperty("verifyLicNum"));//Lic Num
        compare(this.props.getProperty("XorLicType"),this.props.getProperty("verifyLicTypeDropdown"));//Lic Type
        compare(this.props.getProperty("XorCitizen"),"Citizenship Status: " + this.props.getProperty("citStatus"));//Citizenship choice
        compare(this.props.getProperty("XorEthnicity"),"Ethnicity: " + this.props.getProperty("EthnicityChoice"));//Ethnicity choice
        //compare(this.props.getProperty("XorContQuals"),this.props.getProperty(""));//Cont Quals choice
        compare(this.props.getProperty("XorAddr1"),this.props.getProperty("personalAddress"));//Personal Address1
        compare(this.props.getProperty("XorAddr2"),this.props.getProperty("personalAddressCont"));//Personal Address2
        //compare(this.props.getProperty(""),this.props.getProperty(""));//Personal State
        compare(this.props.getProperty("XorZip"),this.props.getProperty("personalZip")+" -");//Personal Zip
        compare(this.props.getProperty("XorPhoneD"),this.props.getProperty("persoanlDayPhone"));//Daytime Phone
        compare(this.props.getProperty("XorPhoneE"),this.props.getProperty("personalEveningPhone"));//Evening Phone
        compare(this.props.getProperty("XorEmail"),this.props.getProperty("personalEmail"));//Persoanl Email

        // TODO compare(this.props.getProperty("XorPSOR"),this.props.getProperty(""));//PSOR choice

        compare(this.props.getProperty("XorEmpIn"),this.props.getProperty("employedin"));//Employed in Nursing
        compare(this.props.getProperty("XorFieldOfEmp"),this.props.getProperty("practiceOther"));//Field of Employment
        compare(this.props.getProperty("XorTypeOfPos"),this.props.getProperty("posOther"));//Type of Position
        compare(this.props.getProperty("XorEmpSpecialty"),this.props.getProperty("specialtyOther"));//Employment Speciality
        compare(this.props.getProperty("XorHighestDegree"),this.props.getProperty("highestDegree"));//Highest Degree Held

        compare(this.props.getProperty("XorEmpName"),this.props.getProperty("empName"));//Employer Name
        compare(this.props.getProperty("XorEmpAddr1"),this.props.getProperty("empAddr"));//Employer addr1
        compare(this.props.getProperty("XorEmpAddr2"),this.props.getProperty("empAddrCont"));//Employer addr2
        compare(this.props.getProperty("XorEmpCity"),this.props.getProperty("empCity"));//Employer city
        compare(this.props.getProperty("XorEmpZip"),this.props.getProperty("empZip"));//Employer Zip


    }

}
