package com.otz;
import static org.junit.Assert.assertEquals;
// import org.junit.Ignore;
import org.junit.Test;

public class MessageUtilTest {
    String message="Orange";
    MessageUtil messageUtil=new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        assertEquals("Orange", messageUtil.printMessage());
    }
    @Test
    public void testPrintGreeting(){
        assertEquals("SomeGreetings", messageUtil.printGreeting());
    }

}
