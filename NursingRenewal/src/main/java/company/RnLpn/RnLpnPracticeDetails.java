package company.RnLpn;
        import org.openqa.selenium.WebDriver;

        import java.util.Properties;

public class RnLpnPracticeDetails extends company.Page{
    protected Properties props;

    public RnLpnPracticeDetails (WebDriver driver, Properties propertiesObj){
        this.driver = driver;
        this.props = propertiesObj;

        if(driver.getPageSource().contains(this.props.getProperty("PracticeDetails_sc"))){
            dropdown(this.props.getProperty("Xemployedin"),this.props.getProperty("employedin"));//Employed in Nursing
            dropdown(this.props.getProperty("XfieldOfEmploy"),this.props.getProperty("fieldOfEmploy"));//Field of Employment
            clearSend(this.props.getProperty("XpracticeOther"),this.props.getProperty("practiceOther"));//Field of Employment If Other
            dropdown(this.props.getProperty("XtypeOfPos"),this.props.getProperty("typeOfPos"));//Type of Position
            clearSend(this.props.getProperty("XposOther"),this.props.getProperty("posOther"));//Type of Position If Other
            dropdown(this.props.getProperty("XempSpecialty"),this.props.getProperty("empSpecialty"));//Employment Specialty
            clearSend(this.props.getProperty("XspecialtyOther"),this.props.getProperty("specialtyOther"));//Employment Specialty If Other
            dropdown(this.props.getProperty("XhighestDegree"),this.props.getProperty("highestDegree"));//Highest Degree Held
            findAndClick(this.props.getProperty("XpracticeDetailCont"));//Continue
        }
    }
    }