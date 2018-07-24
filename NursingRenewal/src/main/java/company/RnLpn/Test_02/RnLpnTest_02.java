package company.RnLpn.Test_02;

import company.AUA.*;
import company.RnLpn.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class RnLpnTest_02{
    protected WebDriver driver;
    protected Properties props;

    //ArrestHold False
    //PSORchoice 3
    //APRN True
    //RX False

    @BeforeTest
    public void init() {
        company.DriverInit driverInitObj = new company.DriverInit("webdriver.chrome.driver", "C:\\Users\\Nickalous.Fulton\\Desktop\\NursingRenewal\\chromedriver.exe", "");
        System.setProperty(driverInitObj.getWebDriver(), driverInitObj.getWebDriverPath());
        this.driver = driverInitObj.webDriverFactoryMethod();

        try (FileInputStream f = new FileInputStream("C:\\Users\\Nickalous.Fulton\\Desktop\\NursingRenewal\\src\\main\\java\\company\\RnLpn\\Test_02/RnLpn_02.properties")) {
            this.props = new Properties();
            this.props.load(f);
            System.out.println(this.props.getProperty("Login.url"));
        } catch (Exception e) {
            e.getMessage();
        }

    }
    @Test(priority = 1)
    public void setup() {
        //this.driver.manage().deleteAllCookies();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
        this.driver.get("https://migration:migrationtest@etsqa.www.ok.gov/nursing/renewal/login.php");
    }
    @Test(priority = 2)
    public void RnLpnverify(){ company.RnLpn.RnLpnVerify ver = new company.RnLpn.RnLpnVerify(this.driver, this.props);}

    @Test(priority = 3)
    public void RnLpnlogin(){ RnLpnLogin aln = new RnLpnLogin(this.driver, this.props); }

    @Test(priority = 4)
    public void RnLpnpersonalInfo(){RnLpnPersonalInfo pi = new RnLpnPersonalInfo(this.driver, this.props);}

    @Test(priority = 5)
    public void psor(){RnLpnPsor rlp = new RnLpnPsor(this.driver, this.props);}

    @Test(priority = 6)
    public void citizen(){Citizen cit = new Citizen(this.driver, this.props);}

    @Test(priority = 7)
    public void citizenshipAffidavit() { CitizenshipAffidavit ca = new CitizenshipAffidavit(this.driver, this.props);}

    @Test(priority = 8)
    public void ethnicity() { Ethnicity eth = new Ethnicity(this.driver, this.props);}

    @Test(priority = 9)
    public void contQuals() {VerifContQuals vcq = new VerifContQuals(this.driver, this.props);}

    @Test(priority = 10)
    public void arrestq() {ArrestQ arq = new ArrestQ(this.driver, this.props);}

    @Test(priority = 11)
    public void qAttest() {QuestionAttest qa = new QuestionAttest(this.driver, this.props);}

    @Test(priority = 12)
    public void renewAprn() {RenewAprn ra = new RenewAprn(this.driver, this.props);}

    @Test(priority = 13)
    public void renewAprn2() {RenewAprn2 ra = new RenewAprn2(this.driver, this.props);}

    @Test(priority = 14)
    public void renewRx() {RenewRx rx = new RenewRx(this.driver, this.props);}

    @Test(priority = 15)
    public void renewRx2() {RenewRx2 rx = new RenewRx2(this.driver, this.props);}

    @Test(priority = 16)
    public void renewRxDEA() {RenewRxDEA rx = new RenewRxDEA(this.driver, this.props);}

    @Test(priority = 17)
    public void renewRxDEAattest() {RenewRxDEAattest rx = new RenewRxDEAattest(this.driver, this.props);}

    @Test(priority = 18)
    public void renewRxDEU() {RenewRxCEU rx = new RenewRxCEU(this.driver, this.props);}

    @Test(priority = 19)
    public void RnLpnPracticeDetails() {RnLpnPracticeDetails pa = new RnLpnPracticeDetails(this.driver, this.props);}

    @Test(priority = 20)
    public void empinfo() {EmployerInfo ei = new EmployerInfo(this.driver, this.props);}

    @Test(priority = 21)
    public void RnLpnconfirmation() {RnLpnConfirmation conf = new RnLpnConfirmation(this.driver,this.props);}

    @Test(priority = 22)
    public void achPayment() {ACHpayment achpay = new ACHpayment(this.driver, this.props);}

    @Test(priority = 23)
    public void achVerify() {ACHverify achv = new ACHverify(this.driver, this.props);}

    //@Test(priority = 24)
    //public void ccPayment() {CCpayment ccpay = new CCpayment(this.driver,this.props);}

    //@Test(priority = 25)
    //public void ccPaymentVerify() {CCpaymentVerify ccpay = new CCpaymentVerify(this.driver,this.props);}




}
