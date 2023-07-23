package dpthao.WebElementAndWebDriver;

import dpthao.Locators.LocatorsCrm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NewCustomer {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin");

        // Login page

        driver.findElement(By.xpath(LocatorsCrm.inputEmail)).sendKeys("admin@example.com");

        driver.findElement(By.xpath(LocatorsCrm.inputPassword)).sendKeys("123456");

        driver.findElement(By.xpath(LocatorsCrm.buttonLogin)).click();

        // Menu Customers

        driver.findElement(By.xpath(LocatorsCrm.menuCustomers)).click();

        // Customers page

        driver.findElement(By.xpath(LocatorsCrm.buttonAddNewCustomer)).click();

        // Add new customer page
        // Customers Details tab
        driver.findElement(By.xpath(LocatorsCrm.inputCompanyName)).sendKeys("Company name");

        driver.findElement(By.xpath(LocatorsCrm.inputVATNumber)).sendKeys("123456");

        driver.findElement(By.xpath(LocatorsCrm.inputPhone)).sendKeys("01214586938");

        driver.findElement(By.xpath(LocatorsCrm.inputWebsite)).sendKeys("Companyname.com");

        driver.findElement(By.xpath(LocatorsCrm.dropdownGroups)).click();
        driver.findElement(By.xpath(LocatorsCrm.optionGroups)).click();

        driver.findElement(By.xpath(LocatorsCrm.dropdownCurrency)).click();
        driver.findElement(By.xpath(LocatorsCrm.optionCurrency)).click();

        driver.findElement(By.xpath(LocatorsCrm.dropdownDefaultLanguage)).click();
        driver.findElement(By.xpath(LocatorsCrm.optionVietnamese)).click();

        driver.findElement(By.xpath(LocatorsCrm.inputAddress)).sendKeys("Hung Loi, Ninh Kieu");

        driver.findElement(By.xpath(LocatorsCrm.inputCity)).sendKeys("Can Tho");

        driver.findElement(By.xpath(LocatorsCrm.inputState)).sendKeys("Viet Name");

        driver.findElement(By.xpath(LocatorsCrm.inputZipCode)).sendKeys("111222");

        driver.findElement(By.xpath(LocatorsCrm.dropdownCountry)).click();
        driver.findElement(By.xpath(LocatorsCrm.optionCountry)).click();

        Thread.sleep(3000);

        // Billing & Shipping tab
        driver.findElement(By.xpath(LocatorsCrm.tabBillingAndShipping)).click();

        driver.findElement(By.xpath(LocatorsCrm.linkSameAsCustomerInfo)).click();

        driver.findElement(By.xpath(LocatorsCrm.linkCopyBillingAddress)).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath(LocatorsCrm.buttonSave)).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
