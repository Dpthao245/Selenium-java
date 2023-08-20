package dpthao.WebElementAndWebDriver;

import dpthao.Locators.LocatorsCrm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NewProject {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
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

        // Menu Projects

        driver.findElement(By.xpath(LocatorsCrm.menuProjects)).click();

        // Projects page

        driver.findElement(By.xpath(LocatorsCrm.buttonAddNewProject)).click();

        // Add new project page
        // Project tab
        driver.findElement(By.xpath(LocatorsCrm.inputProjectName)).sendKeys("Project Name");

        driver.findElement(By.xpath(LocatorsCrm.dropdownCustomer)).click();
        driver.findElement(By.xpath(LocatorsCrm.inputSearchCustomer)).sendKeys("Cus");
        Thread.sleep(5000);
        driver.findElement(By.xpath(LocatorsCrm.optionCustomer)).click();

        driver.findElement(By.xpath(LocatorsCrm.dropdowntBillingType)).click();
        driver.findElement(By.xpath(LocatorsCrm.optionBillingType)).click();

        driver.findElement(By.xpath(LocatorsCrm.dropdownStatus)).click();
        driver.findElement(By.xpath(LocatorsCrm.optionStatus)).click();

        driver.findElement(By.xpath(LocatorsCrm.inputTotalRate)).sendKeys("10%");

        driver.findElement(By.xpath(LocatorsCrm.inputEstimatedHours)).sendKeys("8");

        driver.findElement(By.xpath(LocatorsCrm.dropdownMembers)).click();
        driver.findElement(By.xpath(LocatorsCrm.optionMembers)).click();

        driver.findElement(By.xpath(LocatorsCrm.inputStartDate)).clear();
        driver.findElement(By.xpath(LocatorsCrm.inputStartDate)).sendKeys("25-07-2023");

        driver.findElement(By.xpath(LocatorsCrm.inputDeadline)).sendKeys("30-07-2023");

        driver.findElement(By.xpath(LocatorsCrm.inputTags)).click();
        driver.findElement(By.xpath(LocatorsCrm.optionTags)).click();

        driver.findElement(By.xpath(LocatorsCrm.checkboxSend)).click();

        Thread.sleep(3000);

        // Project Settings tab
        driver.findElement(By.xpath(LocatorsCrm.tabProjectSettings)).click();

        driver.findElement(By.xpath(LocatorsCrm.dropdownSendContactsNotifications)).click();
        driver.findElement(By.xpath(LocatorsCrm.optionSendContactsNotifications)).click();

        driver.findElement(By.xpath(LocatorsCrm.dropdownVisibleTabs)).click();
        driver.findElement(By.xpath(LocatorsCrm.buttonDeselectAll)).click();
        driver.findElement(By.xpath(LocatorsCrm.buttonSelectAll)).click();

        driver.findElement(By.xpath(LocatorsCrm.checkboxHideTasks)).click();

        driver.findElement(By.xpath(LocatorsCrm.buttonSaveProject)).click();

        Thread.sleep(3000);

        driver.quit();




    }

}
