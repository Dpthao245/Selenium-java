package dpthao.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LearningLocators {
    public static void main(String[] args) {
        // Khởi tạo browser với Chrome
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Mở trang crm.anhtester.com
        driver.get("https://crm.anhtester.com/admin/authentication");

        // Xpath trang Login

        // 1. Ô Email Address
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("admin@example.com");

        // 2. Ô Password
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("123456");

        // 3. Checkbox Remember me
        driver.findElement(By.xpath("//input[@id = 'remember']")).click();

        // 4. Nút Login
        driver.findElement(By.xpath("//button[normalize-space()= 'Login']")).click();

        // Xpath trang Admin

        // 1. Menu Customer
        driver.findElement(By.xpath("//span[normalize-space()= 'Customer']")).click();

        // 2. Nút New Customer
        driver.findElement(By.xpath("//span[normalize-space()= 'New Customer']")).click();

        // Xpath trang New Customer

        // Tab Customer Details

        // 1. Ô Company
        driver.findElement(By.xpath("//input[@id= 'company']")).sendKeys("Company test");

        // 2. Ô VAT Number
        driver.findElement(By.xpath("//input[@id= 'vat']")).sendKeys("10");

        // 3. Ô Phone
        driver.findElement(By.xpath("//input[@id= 'phonenumber']")).sendKeys("0123456789");

        // 4. Website
        driver.findElement(By.xpath("//input[@id= 'website']")).sendKeys("companytest.com");

        // 5. Groups
        driver.findElement(By.xpath("//div[@class='dropdown bootstrap-select show-tick input-group-btn _select_input_group bs3']//button[@title='Nothing selected']")).click();

        // 6. Currency
        driver.findElement(By.xpath("//div[@class='dropdown bootstrap-select bs3']//button[@title='System Default']")).click();

        // 7. Default Language
        driver.findElement(By.xpath("//div[@class='dropdown bootstrap-select form-control bs3']//button[@title='System Default']")).click();

        // 8. Address
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("address test ");

        // 9. City
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("city test ");

        // 10. State
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("state test ");

        // 11. Zip Code
        driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("888 999 ");

        // 12. Country
        driver.findElement(By.xpath("//div[@class='dropdown bootstrap-select bs3 open dropup']//button[@title='Nothing selected']")).click();
        driver.findElement(By.xpath("//a[@id='bs-select-4-1']")).click();

        // 13. Nút Save
        driver.findElement(By.xpath("//button[@class='btn btn-primary only-save customer-form-submiter']")).click();

        // 14. Nút Save and create contact
        driver.findElement(By.xpath("//button[normalize-space()='Save and create contact']")).click();


        // Tab Billing & Shipping
        driver.findElement(By.xpath("//a[normalize-space()='Billing & Shipping']")).click();

        // Billing Address

        // 1. Street
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("street test");

        // 2. City
        driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("city test");

        // 3. State
        driver.findElement(By.xpath("//input[@id='billing_state']")).sendKeys("state test");

        // 4. Zip Code
        driver.findElement(By.xpath("//input[@id='billing_zip']")).sendKeys("zip code test");

        // 5. Country
        driver.findElement(By.xpath("//div[@app-field-wrapper='billing_country']//button[@title='Nothing selected']")).click();
        driver.findElement(By.xpath("//a[@id='bs-select-5-1']")).click();

        // Link Same as Customer Info
        driver.findElement(By.xpath("//a[normalize-space()='Same as Customer Info']")).click();

        // Shipping Address
        // 1. Street
        driver.findElement(By.xpath("//textarea[@id='shipping_street']")).sendKeys("street test");

        // 2. City
        driver.findElement(By.xpath("//input[@id='shipping_city']")).sendKeys("city test");

        // 3. State
        driver.findElement(By.xpath("//input[@id='shipping_state']")).sendKeys("state test");

        // 4. Zip Code
        driver.findElement(By.xpath("//input[@id='shipping_zip']")).sendKeys("zip code test");

        // 5. Country
        driver.findElement(By.xpath("//div[@app-field-wrapper='shipping_country']//button[@title='Nothing selected']")).click();
        driver.findElement(By.xpath("//a[@id='bs-select-6-2']")).click();

        // Link Same as Customer Info
        driver.findElement(By.xpath("//a[normalize-space()='Copy Billing Address']")).click();

        // Xpath trang Admin

        // 1. Menu Project
        driver.findElement(By.xpath("//span[normalize-space()= 'Projects']")).click();

        // 2. Nút New Customer
        driver.findElement(By.xpath("//span[normalize-space()= 'New Project']")).click();

        // Xpath trang New Customer

        // Tab Project

        // 1. Ô Project Name
        driver.findElement(By.xpath("//input[@id = 'name']")).sendKeys("Project name test");

        // 2. Ô Customer
        driver.findElement(By.xpath("//button[@class='btn dropdown-toggle bs-placeholder btn-default']")).click();

        // 3. Checkbox Calculate progress through tasks
        driver.findElement(By.xpath("//input[@id='progress_from_tasks']")).click();

        // 4. Ô Billing Type
        driver.findElement(By.xpath("//button[@title='Fixed Rate']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Project Hours']")).click();

        // 5. Ô Status
        driver.findElement(By.xpath("//div[contains(text(),'In Progress')]")).click();
        driver.findElement(By.xpath("//a[@id = 'bs-select-2-1']")).click();

        // 6. Ô Total Rate
        driver.findElement(By.xpath("//input[@id='project_cost']")).sendKeys("100");

        // 7. Ô Estimated Hours
        driver.findElement(By.xpath("//input[@id='estimated_hours']")).sendKeys("6");

        // 8. Ô Members
        driver.findElement(By.xpath("//button[@title='Admin Example']")).click();

        // 9. Ô Start Date
        driver.findElement(By.xpath("//input[@id='start_date']")).click();

        // 10. Ô Deadline
        driver.findElement(By.xpath("//input[@id='deadline']")).click();

        // 11. Ô Tags
        driver.findElement(By.xpath("//li[@class = 'tagit-new']")).click();

        // 12. Ô Description
        driver.findElement(By.xpath("//iframe[@id='description_ifr']")).sendKeys("description test");

        // 13. Checkbox Send project created email
        driver.findElement(By.xpath("//input[@id='send_created_email']")).click();

        // Tab Project Settings
        driver.findElement(By.xpath("//a[normalize-space()='Project Settings']")).click();

        // 1. Ô Send contacts notifications
        driver.findElement(By.xpath("//button[@title='To all contacts with notifications for projects enabled']")).click();

        // 2. Ô Visible Tabs
        driver.findElement(By.xpath("//button[@title='Tasks, Timesheets, Milestones, Files, Discussions, Gantt, Tickets, Contracts, Proposals, Estimates, Invoices, Subscriptions, Expenses, Credit Notes, Notes, Activity']")).click();

        // 3. Checkbox Allow customer to view tasks
        driver.findElement(By.xpath("//label[normalize-space()='Allow customer to view tasks']")).click();

        // 4. Checkbox Allow customer to create tasks
        driver.findElement(By.xpath("//label[normalize-space()='Allow customer to create tasks']")).click();

        // 5. Checkbox Allow customer to edit tasks (only tasks created from contact)
        driver.findElement(By.xpath("//input[@id='edit_tasks']")).click();

        // 6. Checkbox Allow customer to comment on project tasks
        driver.findElement(By.xpath("//input[@id='comment_on_tasks']")).click();

        // 7. Checkbox Allow customer to view task comments
        driver.findElement(By.xpath("//input[@id='view_task_comments']")).click();

        // 8. Checkbox Allow customer to view task attachments
        driver.findElement(By.xpath("//input[@id='view_task_attachments']")).click();

        // 9. Checkbox Allow customer to view task checklist items
        driver.findElement(By.xpath("//input[@id='view_task_checklist_items']")).click();

        // 10. Checkbox Allow customer to upload attachments on tasks
        driver.findElement(By.xpath("//input[@id='upload_on_tasks']")).click();

        // 11. Checkbox Allow customer to view task total logged time
        driver.findElement(By.xpath("//input[@id='view_task_total_logged_time']")).click();

        // 12. Checkbox Allow customer to view finance overview
        driver.findElement(By.xpath("//input[@id='view_finance_overview']")).click();

        // 13. Checkbox Allow customer to upload files
        driver.findElement(By.xpath("//input[@id='upload_files']")).click();

        // 14. Checkbox Allow customer to open discussions
        driver.findElement(By.xpath("//input[@id='open_discussions']")).click();

        // 15. Checkbox Allow customer to view milestones
        driver.findElement(By.xpath("//input[@id='view_milestones']")).click();

        // 16. Checkbox Send project created email
        driver.findElement(By.xpath("//input[@id='view_gantt']")).click();

        // 17. Checkbox Allow customer to view timesheets
        driver.findElement(By.xpath("//input[@id='view_timesheets']")).click();

        // 18. Checkbox Allow customer to view activity log
        driver.findElement(By.xpath("//input[@id='view_activity_log']")).click();

        // 19. Checkbox Allow customer to view team members
        driver.findElement(By.xpath("//input[@id='view_team_members']")).click();

        // 20. Checkbox Hide project tasks on main tasks table (admin area)
        driver.findElement(By.xpath("//input[@id='hide_tasks_on_main_tasks_table']")).click();

        // 21. Nút Save
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

    }
}
