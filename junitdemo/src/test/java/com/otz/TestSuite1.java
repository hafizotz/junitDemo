package com.otz;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   MessageUtilTest.class,
   MessageUtilTestCase2.class,
   MessageUtilTestTimedException.class,
   PrimeNumberCheckerTestParameterized.class
})

public class TestSuite1 {
    
}
