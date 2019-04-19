package test;

import org.testng.ITestContext;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foo2Test  extends Base  {

    @Test
    public void login2Test() {
        System.out.println("2");
        System.out.println(l.get(0));
    }

}
