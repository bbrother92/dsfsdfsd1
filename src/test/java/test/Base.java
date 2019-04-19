package test;

import org.testng.ITestContext;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Base {
    public  List l;

    @BeforeSuite
    public void setUp(ITestContext context) {

        System.out.println("Starting test suite " + context.getCurrentXmlTest().getSuite().getName());
        System.out.println("==========================================");
        l = new ArrayList(Arrays.asList("one", "two","three","four"));

    }

    @BeforeMethod
    public void setUpMethod(Method method) {
        System.out.println("Starting test method: " + method.getName());
    }

    @AfterMethod
    public void tearDownMethod(Method method) {
        System.out.println("Exiting test method: " + method.getName());
    }

    @BeforeClass
    public void setUpClass(ITestContext context) {
        System.out.println("Starting test class: " + context.getCurrentXmlTest().getXmlClasses().toString());
        System.out.println("=============");
    }

    @AfterClass
    public void tearDownClass(ITestContext context) {
        System.out.println("Exiting test class: " + context.getCurrentXmlTest().getXmlClasses().toString());
        System.out.println("=============");
    }

    @AfterSuite
    public void tearDown(ITestContext context) {
        System.out.println("Exiting test suite " + context.getCurrentXmlTest().getSuite().getName());
        System.out.println("==========================================");
    }


    @BeforeTest
    public void set( ) {
        System.out.println("BEFORE TEST");
    }
}
