# hebamansour-insta-
Task(Facebook automation, Test plan &amp; bugs of LinkedIn)


-This project for facebook automation login& registration with selenium by java 

Versions used :
-The user Selenium version 4.10.0
-Chrome driver version 114
-Jdk 20


How To use:
-Download the project folder named (Facebook automation project)
-download testng version 7.8.0 from maven repository : https://mvnrepository.com/artifact/org.testng/testng
-Download chrome driver version 114
-Open project on eclipse
-From Testng folder click build the path and add the downloaded testng jar file path
-From Facebook folder under (src/test/java), Click to run by testng
-in WebDriver method located in Main class, edit the path of driver with the downloaded chrome driver path
     	System.setProperty("webdriver.chrome.driver", "E:\\114chromedriverwin32\\chromedriver.exe");



Tests contains:
-InvalidLogin class contains tests for the invalid scenarios
-TestRegistration class contains tests for the correct registration scenario
-ValidLogin class contains tests for the valid scenario for login
-Main class under (src/main/java) contains the main method the calling the driver and open facebook url 



Explaniation for what expected:

-The main class running with before all classes of tests to run the driver and open facebook url
-when running the facebook package
    -InvalidLogin class will call first and run the invalid scenario of login
    -TestRegistration class will run with filling all fields and continue to register and check that navigate to the confirm the email
    -ValidLogin class will fill the field with correct email/pw and check if the logged in successfully by finding the welconing text of logged in user
