Today's Agenda:

   9:30-10:00-TestNG Assertion
   10:00-10:30-Explicit wait
   10:30-11:00-Exception handling
   11:00-12:00-Extent Report 
   12:00-12:30-Classroom

TestNG Assertion:
Verification and validation:
 Hard Assert
 -Will stop the execution
   -assertEquals()
   -assertTrue()
     //expects true;if it is found true->//if it is found false->fail
   -assertFalse()
    //expects false;if it is found true->fail;//if it is found false->pass  
 Soft Assert
  -Will continue with the execution even if the testcase is marked as failure
   -assertEquals()
   -assertAll()-is mandatory to use when SoftAssert is used 




Waits:
   1)ImplicitlyWait
         -driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         -Only once
         -After launching browser/url
         -findElement() and findElements()
         -findElement()->NoSuchElementException(),findElements()-emptyList
   
   2)Explicit wait:  
       When you like to wait for the element behaviour
      a)element to be clickable
      b)element to become visible
      c)element to be enabled
      d)staleness of the element       

   3)Thread.sleep()  
      -sometimes immediately
      -sometimes it may take longer
     
    Best Approach: Interact as soon as ready
    FluentWait(SuperClass)
    WebDriverWait(SubClass)

    Solution:
      Every 500ms(polling interval) ,the code will go and check if the condition is met or not

      If it is met->Perform the action
      If it is not met->sleep for another 500ms before polling again

      After crossing max time->TimeOut Exception
   
Exception:
   Abnormal behaviour which disrupts the program execution
   Can be handled programatically
   CompileTime Exception 
     -Checked Exceptions
   RunTime Exception
     -Unchecked Exceptions
   All the Selenium Exceptions are RunTime Exception
     -NoSuchElementException
     -StaleElementReferenceException
     -NoAlertPresentException
     -NoSuchWindowException
     -ElementInteractable Exception  

Exception Handling:
   -Apply try/catch block
   -catch block will be executed only when there is an exception
   -try block can have any number of catch block
   -We cannot have try block alone 
   -We cannot have catch block alone
   -All the Exceptions are classes
   -Exception is the super class for all the Exceptions
   -To handle exception catch block is mandatory
      
   
ExtentReport:
  Avenstack
  <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports</artifactId>
            <version>3.1.5</version>
        </dependency>

 Can attach snapshot for each step
 Can have report based on the different author
 Can have report based on the different category
 Consolidated dashboard with graphs

Extent classes:
==============
   ExtentHTMlReporter
   ExtentReport
   ExtentTest
   MediaEntityBuilder
