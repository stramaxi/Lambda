package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

public class NumberTester
{
    private String fileName;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromTester;
    File file;

    public NumberTester(String fileName) {
        this.fileName = fileName;
        file = new File(fileName);
    }
    public void setOddEvenTester(NumberTest oddTester)
    {
            this.oddTester = oddTester;
    }
    public void setPrimeTester(NumberTest primeTester)
    {
        this.primeTester = primeTester;
    }
    public void setPalindromTester(NumberTest palindromTester)
    {
        this.palindromTester = palindromTester;
    }
    public void testFile(int number)
    {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
