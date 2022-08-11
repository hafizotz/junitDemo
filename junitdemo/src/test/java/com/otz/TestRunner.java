package com.otz;


import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream fileOut = new PrintStream("./testresults/testOut.txt");
        System.setOut(fileOut);

        Result result = JUnitCore.runClasses(TestSuite1.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
        fileOut.close();
    }
}