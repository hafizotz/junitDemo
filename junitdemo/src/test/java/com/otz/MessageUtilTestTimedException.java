package com.otz;
import static org.junit.Assert.assertEquals;
// import org.junit.Ignore;
import org.junit.Test;

public class MessageUtilTestTimedException {
    String message="Orange";
    MessageUtil messageUtil=new MessageUtil(message);

    @Test(timeout = 1000)
    public void testPrintMessage(){
        assertEquals("Orange", messageUtil.printMessage());
    }

    DivisionByZero divByZero = new DivisionByZero(); 
    @Test(expected = ArithmeticException.class)
    public void testPrintGreeting(){
        System.out.println(divByZero.performDivisionByZero());
    }
}
