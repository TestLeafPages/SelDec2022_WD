Todays Agenda:

   9:30-10:30->Extent Report Integration
   10:30-11:00->Classroom
   11:00-11:30->ThreadLocal Integration
   11:30-12:30->Hybrid Framework

   Steps Extent Report Integration:
    1)Create startReport() and annotate with @BeforeSuite
       -set physical path
       -attach reporter
    2)Create testCaseDetails() and annotate with @BeforeClass
       -testname ,testDescription,testAuthor,testCategory
    3)Create stopReport() and annotate with @AfterSuite
        -Add extent.flush()   
    4)Create reportStep()
       -Write if condition 
       -Assign step level status and attach snapshot
    5)Create takeSnap() 
        -Put screenshot code
        -Generate a randomNumber and attach with each snapshot
        -return randomNumber      
    
@BeforeSuite(startReport())

  @BeforeTest(setValues())

    @BeforeClass(testCaseDetails())

      @DataProvider(sendData())

         @BeforeMethod(preCondition())

                  @Test(runLogin())

        @AfterMethod(postCondition())

   @AfterClass(Nil)

 @AfterTest(Nil)

@AfterSuite(stopReport())    

ThreadLocal:
   If we want to access a private  variable we can achieve through getter and setter method
