package com.otz;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

public class MessageUtilTest {
    String message="Orange";
    MessageUtil messageUtil=new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        assertEquals("Orange", messageUtil.printMessage());
    }
    @Ignore
    public void testPrintGreeting(){
        assertEquals("SomeGreeting", messageUtil.printGreeting());
    }

}
