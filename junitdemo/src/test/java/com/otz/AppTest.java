package com.otz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /**
     * Rigorous Test :-)
     * @throws FileNotFoundException
     */
    @Ignore
    public void shouldAnswerWithTrue() throws FileNotFoundException
    {
        PrintStream fileOut = new PrintStream("./testresults/testOut.txt");
        System.setOut(fileOut);
        // assertEquals("Hey","Hi");
        try{
            assertTrue(false);
            System.out.println(true);
        }catch(AssertionError e){
            System.out.println(false+":"+e.getStackTrace().toString());
            throw e;
        }
    }
}
