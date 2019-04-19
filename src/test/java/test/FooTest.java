package test;

import org.testng.ITestContext;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FooTest  extends Base   {

    @Test
    public void loginTest() {
        System.out.println("1");
        System.out.println(l.get(0));
    }



}
