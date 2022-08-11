package com.otz;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

public class MessageUtilTestCase2 {
    String message="Orange";
    MessageUtil messageUtil=new MessageUtil(message);

    @Ignore
    public void testPrintMessageUnequal(){
        assertEquals("apple",messageUtil.printMessage());
    }
}
