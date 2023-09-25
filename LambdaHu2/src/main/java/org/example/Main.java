package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        HalloJavamitForEach hallo = new HalloJavamitForEach();
        for (String s:hallo.getList()) {
            System.out.println(s);
        }

        hallo.getList().forEach(System.out::println);
    }
}