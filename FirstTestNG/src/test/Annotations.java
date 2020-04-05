package test;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class Annotations {
    
  
    @Test(priority=2)
    public void test1() {
       System.out.println("Test Annotation no. 1");
    }
 
    @Test (description="This is test 2")
    public void test2() {
       System.out.println("Test annotation no. 2");
    }
    
    @Test (priority=1)
    public void test3() {
       System.out.println("Test annotation no. 3");
    }
 
    @Test (description="This is test 4")
    public void test4() {
       System.out.println("Test annotation no. 4");
       Assert.assertTrue(false);
    }
    
    
    @Test(dependsOnMethods= {"test4"})
    public void test5() {
        System.out.println("Test annotation no. 5");
     } 
    
    
    @Test(enabled=false)
    public void test6() {
        System.out.println("Test annotation no. 6");
     } 


}



/*
@BeforeTest
public void beforeTest() {
   System.out.println("Before Test Annotation");
}

@AfterTest
public void afterTest() {
   System.out.println("After Test Annotation");
}

@BeforeMethod
public void beforeMethod() {
   System.out.println("Before Method Annotation");
}

@AfterMethod
public void afterMethod() {
   System.out.println("After Method Annotation");
}

@BeforeClass
public void beforeClass() {
   System.out.println("Before Class Annotation");
}

@AfterClass
public void afterClass() {
   System.out.println("After Class Annotation");
}


@BeforeSuite
public void beforeSuite() {
   System.out.println("Before Suite Annotation");
}

@AfterSuite
public void afterSuite() {
   System.out.println("After Suite Annotation");
}
*/