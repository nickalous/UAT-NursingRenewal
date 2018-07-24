package company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

abstract public class Page {
    protected WebDriver driver;

    public void clearSend(String xpath, String inputText) {

        WebElement element1 = this.driver.findElement(By.xpath(xpath));
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        this.driver.findElement(By.xpath(xpath)).clear();
        this.driver.findElement(By.xpath(xpath)).sendKeys(inputText);

    }

    public WebElement moveTo(String xpath) {
        WebElement element1 = this.driver.findElement(By.xpath(xpath));
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element1);

        return element1;
    }

    public void findAndClick(String xpath) {
        WebElement element1 = this.driver.findElement(By.xpath(xpath));
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        element1.click();

    }

    public void dropdown(String xpath, String selection) {
        Select s = new Select(this.driver.findElement(By.xpath(xpath)));
        s.selectByVisibleText(selection);

    }

    public void compare(String xpath, String value) {                    //value = the expected value
        WebElement target = driver.findElement(By.xpath(xpath));
        Assert.assertEquals(target.getText(), value);
    }

    public void findInTable(String tableId) {
        WebElement element1 = this.driver.findElement(By.partialLinkText(tableId));
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        element1.click();
    }

    public void printField(String xpath) {
        String text;
        WebElement target = driver.findElement(By.xpath(xpath));
        text = target.getText();
        System.out.println(text);

    }

    public String findAndSave(String xpath){
        String value;
        WebElement target = driver.findElement(By.xpath(xpath));
        value = target.getText();
        return value;
    }

    public void sourceCheck(String text) {
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains(text));

    }

    public void empty(String xpath) {

        WebElement element1 = this.driver.findElement(By.xpath(xpath));
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        this.driver.findElement(By.xpath(xpath)).clear();
    }
}




