package company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverInit{
    protected String webDriver;
    protected String webDriverPath;
    protected WebDriver driver;
    protected String entryPoint;
    protected int steps;

    public DriverInit(String webDriver, String webDriverPath, String entryPoint){
        this.webDriver = webDriver;
        this.webDriverPath = webDriverPath;
        this.entryPoint = entryPoint;
    }

    public String getWebDriver() {
        return webDriver;
    }

    public String getWebDriverPath() {
        return webDriverPath;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public DriverInit(){
        String osSeparator = System.getProperty("file.separator");
        if (osSeparator.equals("\\")){
            this.webDriver = "webdriver.gecko.driver";
            this.webDriverPath = "/opt/selenium/webDrivers/geckodriver";
            this.entryPoint = "https://www.google.com";
        }else{

            this.webDriver = "webdriver.gecko.driver";
            this.webDriverPath = "C:\\Selenium_jars\\selenium-java-3.12.0";
            this.entryPoint = "https://www.google.com";
        }
    }

    /**
     * Create a WebDriver object relative to the
     * @return
     * @throws Exception
     */
    public WebDriver webDriverFactoryMethod() {
        String webDriverName;
        int firstDot, secondDot;
        WebDriver driver;
        firstDot = this.webDriver.indexOf('.');
        String trimFront = this.webDriver.substring(firstDot + 1);
        secondDot = trimFront.indexOf('.');
        webDriverName = trimFront.substring(0, secondDot);

        if(webDriverName.equals("gecko")){
            driver = new FirefoxDriver();
        }else {
            driver = new ChromeDriver();
        }

        return driver;
    }


    /**
     * Set up system properties webdriver and driver path
     * create a driver and set instance diver variable.
     */
    public void setSystemAndDriver(){
        System.setProperty(this.webDriver, this.webDriverPath);

        try{
            this.driver = webDriverFactoryMethod();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * set the implicit wait time start web entry point
     * @param seconds
     */
    public void setupStepsGetEntrypoint(int seconds){
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
        System.out.println("Starting Runner.");
        System.out.println("Setting step count to zero");
        this.steps = 0;
        System.out.println("Trying to reach domain at: " + this.entryPoint);
        driver.get(this.entryPoint);
    }

    public String getPage(String fullUrl){
        String[] url;
        url = fullUrl.split("/");
        int sizeOfUrl = url.length;
        String page = url[sizeOfUrl -1];
        return page;
    }



}