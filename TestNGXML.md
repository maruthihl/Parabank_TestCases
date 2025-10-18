<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Parabank Test Suite" parallel="tests" thread-count="2">

    <!-- Login Module -->
    <test name="Login Tests">
        <classes>
            <class name="com.example.parabank.tests.LoginTest"/>
        </classes>
    </test>

    <!-- Account Creation Module -->
    <test name="Account Creation Tests">
        <classes>
            <class name="com.example.parabank.tests.AccountCreationTest"/>
        </classes>
    </test>

    <!-- Fund Transfer Module -->
    <test name="Fund Transfer Tests">
        <classes>
            <class name="com.example.parabank.tests.FundTransferTest"/>
        </classes>
    </test>

    <!-- Bill Pay Module -->
    <test name="Bill Pay Tests">
        <classes>
            <class name="com.example.parabank.tests.BillPayTest"/>
        </classes>
    </test>

    <!-- Transaction History Module -->
    <test name="Transaction History Tests">
        <classes>
            <class name="com.example.parabank.tests.TransactionHistoryTest"/>
        </classes>
    </test>

</suite>
How it works

Each <test> corresponds to a module in your Test Plan.

Each <class> should point to your TestNG Java test class for that module.

parallel="tests" with thread-count="2" allows running modules in parallel (optional, can remove if sequential execution needed).

When you run mvn test, Surefire plugin reads this XML and executes all the tests automatically.