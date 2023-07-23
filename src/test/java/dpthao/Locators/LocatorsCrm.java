package dpthao.Locators;

public class LocatorsCrm {
    // Login CRM
    static public String headerLoginPage = "//h1[normalize-space() = 'Login']";
    static public String inputEmail = "//input[@id = 'email']";
    static public String inputPassword = "//input[@id = 'password']";
    static public String inputRememberme = "//input[@id = 'remember']";
    static public String buttonLogin = "//button[@type = 'submit']";
    static public String linkForgotPassword = "//a[normalize-space() = 'Forgot Password?']";

    // Dashboard
    static public String menuDashboard = "//span[normalize-space()='Dashboard']";
    static public String menuCustomers = "//span[normalize-space() = 'Customers']";
    static public String menuProjects = "//span[normalize-space() = 'Projects']";


    // Customers
    static public String buttonAddNewCustomer = "//a[normalize-space() = 'New Customer']";
    static public String buttonImportCustomers = "//a[normalize-space() = 'Import Customers']";
    static public String buttonContacts = "//a[contains(@href, 'all_contacts')]";
    static public String headerCustomerPage = "//span[normalize-space() = 'Customers Summary']";
    static public String inputSearchCustomers = "//div[@id = 'DataTables_Table_0_filter']//input[@type = 'search']";

    // Add new customer
    static public String buttonSaveAndCreateContact = "//button[normalize-space()= 'Save and create contact']";
    static public String buttonSave = "//div[@id= 'profile-save-section']//button[normalize-space()= 'Save']";

    // Tab Customer Details
    static public String tabCustomerDetails = "//a[normalize-space() = 'Customer Details']";
    static public String inputCompanyName = "//input[@id='company']";
    static public String inputVATNumber = "//input[@id='vat']";
    static public String inputPhone = "//input[@id='phonenumber']";
    static public String inputWebsite = "//input[@id='website']";
    static public String dropdownGroups = "//button[@data-id = 'groups_in[]']";
    static public String inputSearchGroups = "//div[@app-field-wrapper = 'groups_in[]']//input[@type = 'search']";
    static public String optionGroups = "//span[normalize-space()='VIP']";
    static public String dropdownCurrency = "//button[@data-id = 'default_currency']";
    static public String inputSearchCurrency = "//div[@app-field-wrapper = 'default_currency']//input[@type = 'search']";
    static public String optionCurrency =  "//span[contains(text(),'VNĐ')]";
    static public String dropdownDefaultLanguage = "//button[@data-id= 'default_language']";
    static public String optionVietnamese = "//span[normalize-space()='Vietnamese']";
    static public String inputAddress = "//textarea[@id='address']";
    static public String inputCity = "//input[@id='city']";
    static public String inputState = "//input[@id='state']";
    static public String inputZipCode = "//input[@id='zip']";
    static public String dropdownCountry = "//button[@data-id= 'country']";
    static public String optionCountry ="//span[normalize-space()='Vietnam']";
    static public String inputSearchCountry = "//div[@app-field-wrapper = 'country']//input[@type = 'search']";

    // Tab Billing And Shipping
    static public String tabBillingAndShipping = "//a[normalize-space()='Billing & Shipping']";
    static public String linkBillingAdress = "//body//div[@id='wrapper']//div[@class='row']//div[@class='row']//div[@class='row']//div[@class='row']//div[1]//h4[1]";
    static public String linkSameAsCustomerInfo = "//a[@class='billing-same-as-customer tw-text-sm tw-text-neutral-500 hover:tw-text-neutral-700 active:tw-text-neutral-700']";
    static public String linkShippingAddress = "//span[normalize-space()='Shipping Address']";
    static public String linkCopyBillingAddress = "//a[@class='customer-copy-billing-address tw-text-sm tw-text-neutral-500 hover:tw-text-neutral-700 active:tw-text-neutral-700']";
    static public String inputBillingStreet = "//textarea[@id='billing_street']";
    static public String inputBillingCity = "//input[@id='billing_city']";
    static public String inputBillingState = "//input[@id='billing_state']";
    static public String inputBillingZipCode = "//input[@id='billing_zip']";
    static public String dropdownBillingCountry = "//button[@data-id='billing_country']";
    static public String inputSearchBillingCountry = "//div[@app-field-wrapper='billing_country']//input[@type='search']";
    static public String inputShippingstreet = "//textarea[@id='shipping_street']";
    static public String inputShippingCity = "//input[@id='shipping_city']";
    static public String inputShippingState = "//input[@id='shipping_state']";
    static public String inputShippingZipCode = "//input[@id='shipping_zip']";
    static public String dropdownShippingCountry = "//button[@data-id='shipping_country']";
    static public String inputSearchShippingCountry = "//div[@app-field-wrapper='shipping_country']//input[@type='search']";

    // Projects
    static public String buttonAddNewProject = "//a[normalize-space() = 'New Project']";
    static public String inputSearchProjects = "//div[@id = 'DataTables_Table_0_filter']//input[@type = 'search']";

    // Add new project
    static public String headerAddNewProjectPage = "//form[@id='project_form']/descendant::h4[normalize-space()='Add new project']";
    static public String buttonSaveProject = "//div[@class='panel-footer text-right']/child::button";

    // Tab Project
    static public String tabProject = "//li[@role='presentation']/child::a[@aria-controls='tab_project']";
    static public String inputProjectName = "//label[normalize-space()='* Project Name']/following-sibling::input";
    static public String dropdownCustomer = "//label[@for='clientid']/following-sibling::div//button";
    static public String inputSearchCustomer = "//label[@for='clientid']/following-sibling::div//input";
    static public String optionCustomer = "//span[normalize-space()='Cucumber2023']";
    static public String checkboxCalculateProgress = "//input[@id='progress_from_tasks']";
    static public String sliderProgress = "//label[contains(text(),'Progress')]/following-sibling::input[@name = 'progress']";
    static public String dropdowntBillingType = "//label[@for = 'billing_type']/following-sibling::div[contains(@class, 'dropdown ')]";
    static public String optionBillingType = "//span[normalize-space()='Project Hours']";
    static public String dropdownStatus = "//label[@for = 'status']/following-sibling::div[contains(@class, 'dropdown ')]";
    static public String optionStatus = "//span[normalize-space()='On Hold']";
    static public String inputTotalRate = "//label[normalize-space()='Rate Per Hour']/following-sibling::input";
    static public String inputEstimatedHours = "//label[normalize-space()='Estimated Hours']/following-sibling::input";
    static public String dropdownMembers = "//label[normalize-space()='Members']/following-sibling::div/button[@data-toggle='dropdown']";
    static public String inputSearchMembers = "//label[normalize-space()='Members']/following-sibling::div//input[@type='search']";
    static public String optionMembers = "//span[normalize-space()='Anh Tester']";
    static public String inputStartDate = "//label[@for='start_date']/following-sibling::div//input";
    static public String inputDeadline = "//label[@for='deadline']/following-sibling::div//input";

    // static public String inputTags = "//label[normalize-space()='Tags']/following-sibling::input";
    static public String inputTags = " //input[@placeholder='Tag']";
    static public String optionTags = "//li[@class='ui-menu-item']//div[normalize-space()='Automation Test']";

    static public String inputDescription = "//body[@data-id = 'description']";
    static public String checkboxSend = "//label[normalize-space()='Send project created email']/preceding-sibling::input";

    // Tab Project Settings
    static public String tabProjectSettings = "//li[@role='presentation']/child::a[@aria-controls='tab_settings']";
    static public String dropdownSendContactsNotifications = "//label[@for='contact_notification']/following-sibling::div//button";
    static public String optionSendContactsNotifications = "//span[normalize-space()='Do not send notifications']";
    static public String dropdownSelectContactsToNotify = "//label[normalize-space()='* Select contacts to notify']/following-sibling::div//button";
    static public String dropdownVisibleTabs = "//label[normalize-space()='Visible Tabs']/following-sibling::div//button[@data-toggle='dropdown']";
    static public String buttonSelectAll = "//label[normalize-space()='Visible Tabs']/following-sibling::div//button[normalize-space()='Select All']";
    static public String buttonDeselectAll = "//label[normalize-space()='Visible Tabs']/following-sibling::div//button[normalize-space()='Deselect All']";
    static public String optionVisibleTabs = "//label[normalize-space()='Visible Tabs']/parent::div//span[normalize-space()='Tasks']";
    static public String checkboxViewTasks = "//label[@for='view_tasks']/preceding-sibling::input";
    static public String checkboxCreateTasks = "//label[@for='create_tasks']/preceding-sibling::input";
    static public String checkboxEditTasks = "//label[@for='edit_tasks']/preceding-sibling::input";
    static public String checkboxCommentOnTasks = "//label[@for='comment_on_tasks']/preceding-sibling::input";
    static public String checkboxViewTaskComments = "//label[@for='view_task_comments']/preceding-sibling::input";
    static public String checkboxViewAttachments = "//label[@for='view_task_attachments']/preceding-sibling::input";
    static public String checkboxViewTaskChecklistItems = "//label[@for='view_task_checklist_items']/preceding-sibling::input";
    static public String checkboxUploadOnTasks = "//label[@for='upload_on_tasks']/preceding-sibling::input";
    static public String checkboxViewTaskTotalLoggedTime = "//label[@for='view_task_total_logged_time']/preceding-sibling::input";
    static public String checkboxViewFinanceOverview = "//label[@for='view_finance_overview']/preceding-sibling::input";
    static public String checkboxUploadFile = "//label[@for='upload_files']/preceding-sibling::input";
    static public String checkboxOpenDiscussions = "//label[@for='open_discussions']/preceding-sibling::input";
    static public String checkboxViewMilestones = "//label[@for='view_milestones']/preceding-sibling::input";
    static public String checkboxViewGantt = "//label[@for='view_gantt']/preceding-sibling::input";
    static public String checkboxViewTimesheets = "//label[@for='view_timesheets']/preceding-sibling::input";
    static public String checkboxViewActivityLog = "//label[@for='view_activity_log']/preceding-sibling::input";
    static public String checoboxViewTeamMembers = "//label[@for='view_team_members']/preceding-sibling::input";
    static public String checkboxHideTasks = "//label[@for='hide_tasks_on_main_tasks_table']/preceding-sibling::input";
}
