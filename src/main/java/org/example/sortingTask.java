package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortingTask {
    public static void main(String[] args) {
        String teststring = "Can I block your calendar from 5:30 to 6pm today to review/discuss on test case scenarios for HK dashboard cards ";
        List<String> testString= Arrays.asList(teststring.split("\u0020"));
        Collections.sort(testString, Comparator.comparingInt(String::length).reversed());
        System.out.print(testString);
    }
}