package company.AUA;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//TODO List of tests to add: URL checks, Page title checks, Cycle through dropdown choices, Passing empty values
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

public class AUATest {
    protected WebDriver driver;
    protected Properties props;


    @BeforeTest
    public void init() {
        company.DriverInit driverInitObj = new company.DriverInit("webdriver.chrome.driver", "C:\\Users\\Nickalous.Fulton\\Desktop\\NursingRenewal\\chromedriver.exe", "");
        System.setProperty(driverInitObj.getWebDriver(), driverInitObj.getWebDriverPath());
        this.driver = driverInitObj.webDriverFactoryMethod();

        try (FileInputStream f = new FileInputStream("C:\\Users\\Nickalous.Fulton\\Desktop\\NursingRenewal\\src\\main\\java\\company\\AUA/AUA.properties")) {
            this.props = new Properties();
            this.props.load(f);
            System.out.println(this.props.getProperty("Login.url"));
        } catch (Exception e) {
            e.getMessage();
        }

    }
    @Test (priority = 1)
    public void setup() {
        this.driver.manage().deleteAllCookies();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
        this.driver.get("https://migration:migrationtest@etsstg.www.ok.gov/nursing/renewal/login.php");
    }

    @Test(priority = 3)
    public void auaLogin(){ AUAlogin aln = new AUAlogin(this.driver, this.props); }

    @Test(priority = 2)
    public void verify(){ Verify ver = new Verify(this.driver, this.props);}

    @Test(priority = 4)
    public void citizen(){Citizen cit = new Citizen(this.driver, this.props);}

    @Test(priority = 5)
    public void citizenshipAffidavit() { CitizenshipAffidavit ca = new CitizenshipAffidavit(this.driver, this.props);}

    @Test(priority = 6)
    public void ethnicity() { Ethnicity eth = new Ethnicity(this.driver, this.props);}

    @Test(priority = 7)
    public void contQuals() {VerifContQuals vcq = new VerifContQuals(this.driver, this.props);}

    @Test(priority = 8)
    public void arrestq() {ArrestQ arq = new ArrestQ(this.driver, this.props);}

    @Test(priority = 9)
    public void qAttest() {QuestionAttest qa = new QuestionAttest(this.driver, this.props);}

    @Test(priority = 10)
    public void practiceDetails() {AUAPracticeDetails pa = new AUAPracticeDetails(this.driver, this.props);}

    @Test(priority = 11)
    public void empinfo() {EmployerInfo ei = new EmployerInfo(this.driver, this.props);}

    @Test(priority = 12)
    public void personalInfo(){PersonalInfo pi = new PersonalInfo(this.driver, this.props);}

    @Test(priority = 13)
    public void confirmation() {AUAconfirmation conf = new AUAconfirmation(this.driver,this.props);}

    @Test(priority = 14)
    public void achPayment() {ACHpayment achpay = new ACHpayment(this.driver, this.props);}

    @Test(priority = 15)
    public void achVerify() {ACHverify achv = new ACHverify(this.driver, this.props);}

    //@Test(priority = 16)
    //public void ccPayment() {CCpayment ccpay = new CCpayment(this.driver,this.props);}

    //@Test(priority = 17)
    //public void ccPaymentVerify() {CCpaymentVerify ccpay = new CCpaymentVerify(this.driver,this.props);}
}
