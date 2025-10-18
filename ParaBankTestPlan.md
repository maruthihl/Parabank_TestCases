Parabank Automation – Test Plan
1. Project Overview

Project Name: Parabank Web Application
Objective: To ensure reliable, secure, and bug-free banking operations including login, account creation, fund transfer, and transaction management.
Automation Tool: Selenium WebDriver + Java + TestNG + Maven
Version Control: Git/GitHub
Reporting: TestNG HTML Reports, Surefire Reports

2. Scope of Testing
In Scope	Out of Scope
Login, Logout	Mobile app testing
Account Creation	Performance/load testing
Fund Transfer	Third-party API integrations
Bill Pay	Manual UI style changes
Transaction History	Hardware/OS testing
Automation for Regression Testing	Non-functional exploratory testing
3. Modules and Test Cases
Module 1: Login
Test Case ID	Description	Test Data	Priority	Type
TC_Login_01	Valid login	Valid username/password	High	Positive
TC_Login_02	Invalid login	Invalid username/password	High	Negative
TC_Login_03	Empty credentials	Blank username/password	Medium	Negative
TC_Login_04	Logout functionality	Valid login	High	Positive
Module 2: Account Creation
Test Case ID	Description	Test Data	Priority	Type
TC_Acc_01	Valid account creation	Name, Address, Initial deposit	High	Positive
TC_Acc_02	Mandatory fields validation	Empty fields	High	Negative
TC_Acc_03	Invalid data validation	Invalid email, phone	Medium	Negative
Module 3: Fund Transfer
Test Case ID	Description	Test Data	Priority	Type
TC_FT_01	Valid fund transfer	Account A → Account B, Amount	High	Positive
TC_FT_02	Insufficient balance	Transfer amount > balance	High	Negative
TC_FT_03	Invalid account number	Non-existent account	Medium	Negative
Module 4: Bill Pay
Test Case ID	Description	Test Data	Priority	Type
TC_BP_01	Add Payee	Name, Account, Bank	High	Positive
TC_BP_02	Make Payment	Payee, Amount	High	Positive
TC_BP_03	Payment Failure	Invalid payee/account	Medium	Negative
Module 5: Transaction History
Test Case ID	Description	Test Data	Priority	Type
TC_TH_01	Verify transactions	Date range	High	Positive
TC_TH_02	Filter by amount	Min & Max amount	Medium	Positive
TC_TH_03	Invalid filter	Start date > End date	Low	Negative
4. Test Data Management

Test accounts with dummy names, emails, and balances.

Use separate test accounts for fund transfer and bill pay to avoid real transactions.

Store credentials and configs in src/main/config/config.properties.

5. Automation Strategy
Feature	Automation Approach	Notes
Login	Selenium + TestNG	Use DataProvider for multiple credentials
Account Creation	Selenium + TestNG	Validate all mandatory fields before creation
Fund Transfer	Selenium + TestNG	Test positive and negative flows
Bill Pay	Selenium + TestNG	Automation for payee addition & payment verification
Transaction History	Selenium + TestNG	Verify transactions using assertions

Framework Design:

Page Object Model (POM): Separate page locators and test scripts.

Base Class: Common methods for browser setup, teardown, and utilities.

TestNG XML: Suite execution, grouping, and prioritization.

Reports: TestNG + Surefire reports, console logging.

6. Testing Types

Functional Testing: Verify app features work as expected.

Regression Testing: Ensure new code doesn’t break existing features.

Positive & Negative Testing: Handle valid and invalid input cases.

Boundary Testing: Test minimum and maximum inputs for fields.

Smoke/Sanity Testing: Quick validation after every build.

7. STLC Steps (Applied to Parabank)

Requirement Analysis: Understand banking operations & constraints.

Test Planning: Define scope, objectives, priority modules, and tools.

Test Case Design: Create detailed test cases (steps, expected results, data).

Test Environment Setup: Browsers, Selenium setup, test accounts.

Test Execution: Manual or automated execution using TestNG.

Defect Logging & Tracking: Use GitHub issues or Excel for defects.

Test Reporting: Summarize results, logs, screenshots, reports.

Test Closure: Sign-off when all critical defects are resolved.

8. Test Deliverables

Test Plan Document (this document)

Test Cases & Test Data

Automation Scripts

Test Execution Reports (HTML/Console)

Defect Logs (if any)
Summary Report at project end