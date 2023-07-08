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
    static public String buttonSaveAndCreateContact = "//button[@class='btn btn-default save-and-add-contact customer-form-submiter']";
    static public String buttonSave = "//button[@class='btn btn-primary only-save customer-form-submiter']";

    // Tab Customer Details
    static public String tabCustomerDetails = "//a[normalize-space() = 'Customer Details']";
    static public String inputCompanyName = "//input[@id='company']";
    static public String inputVATNumber = "//input[@id='vat']";
    static public String inputPhone = "//input[@id='phonenumber']";
    static public String inputWebsite = "//input[@id='website']";
    static public String inputGroups = "//div[@class='dropdown bootstrap-select show-tick input-group-btn _select_input_group bs3']//div[@class='filter-option-inner-inner'][normalize-space()='Nothing selected']";
    static public String inputCurrency = "//div[@class='dropdown bootstrap-select bs3']//button[@title='System Default']";
    static public String inputDefault Language = "//button[@class='btn dropdown-toggle btn-default']";
    static public String inputAddress = "//textarea[@id='address']";
    static public String inputCity = "//input[@id='city']";
    static public String inputState = "//input[@id='state']";
    static public String inputZipCode = "//input[@id='zip']";
    static public String inputCountry = "//div[@app-field-wrapper='country']//button[@title='Nothing selected']";

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
    static public String inputBillingCountry = "//div[@app-field-wrapper='billing_country']//button[@title='Nothing selected']";
    static public String inputShippingstreet = "//textarea[@id='shipping_street']";
    static public String inputShippingCity = "//input[@id='shipping_city']";
    static public String inputShippingState = "//input[@id='shipping_state']";
    static public String inputShippingZipCode = "//input[@id='shipping_zip']";
    static public String inputShippingCountry = "//div[@app-field-wrapper='shipping_country']//button[@title='Nothing selected']";

    // Projects
    static public String buttonAddNewProject = "//a[normalize-space() = 'New Project']";
    static public String inputSearchProjects = "//div[@id = 'DataTables_Table_0_filter']//input[@type = 'search']";

    // Add new project
    static public String headerAddNewProjectPage = "//h4[normalize-space() = 'Add new project']";
    static public String buttonSave = "//button[@type='submit']";

    // Tab Project
    static public String tabProject = "//a[@role='tab'][normalize-space()='Project']";
    static public String inputProjectName = "//input[@id='name']";
    static public String inputCustomer = "//button[@class='btn dropdown-toggle bs-placeholder btn-default']";
    static public String inpuCalculateProgressThroughTasks = "//input[@id='progress_from_tasks']";
    static public String inputBillingType = "//button[@title='Fixed Rate']";
    static public String inputStatus = "//button[@title='In Progress']";
    static public String inputTotalRate = "//input[@id='project_cost']";
    static public String inputEstimatedHours = "//input[@id='estimated_hours']";
    static public String inputMembers = "//button[@title='Admin Example']";
    static public String inputStartDate = "//input[@id='start_date']";
    static public String inputDeadline = "//input[@id='deadline']";
    static public String inputTags = "//input[@placeholder='Tag']";
    static public String inputDescription = "//iframe[@id='description_ifr']";
    static public String inputSendProjectCreatedEmail = "//input[@id='send_created_email']";

    // Tab Project Settings
    static public String tabProjectSettings = "//a[normalize-space()='Project Settings']";
    static public String inputSendContactsNotifications = "//button[@title='To all contacts with notifications for projects enabled']";
    static public String inputVisibleTabs = "//button[@title='Tasks, Timesheets, Milestones, Files, Discussions, Gantt, Tickets, Contracts, Proposals, Estimates, Invoices, Subscriptions, Expenses, Credit Notes, Notes, Activity']";
    static public String inputViewTasks = "//input[@id='view_tasks']";
    static public String inputCreateTasks = "//input[@id='create_tasks']";
    static public String inputEditTasks = "//input[@id='edit_tasks']";
    static public String inputCommentOnTasks = "//input[@id='comment_on_tasks']";
    static public String inputViewTaskComments = "//input[@id='view_task_comments']";
    static public String inputViewAttachments = "//input[@id='view_task_attachments']";
    static public String inputViewTaskChecklistItems = "//input[@id='view_task_checklist_items']";
    static public String inputUploadOnTasks = "//input[@id='upload_on_tasks']";
    static public String inputViewTaskTotalLoggedTime = "//input[@id='view_task_total_logged_time']";
    static public String inputViewFinanceOverview = "//input[@id='view_finance_overview']";
    static public String inputUploadFile = "//input[@id='upload_files']";
    static public String inputOpenDiscussions = "//input[@id='open_discussions']";
    static public String inputViewMilestones = "//input[@id='view_milestones']";
    static public String inputViewGantt = "//input[@id='view_gantt']";
    static public String inputViewTimesheets = "//input[@id='view_timesheets']";
    static public String inputViewActivityLog = "//input[@id='view_activity_log']";
    static public String inputViewTeamMembers = "//input[@id='view_team_members']";
    static public String inputHideTasks = "//input[@id='hide_tasks_on_main_tasks_table']";

}
