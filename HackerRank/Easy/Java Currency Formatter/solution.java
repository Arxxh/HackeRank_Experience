// HackerRank Problem: Java Currency Formatter
// Link: https://www.hackerrank.com/challenges/java-currency-formatter/problem
// Difficulty: Easy
// Language: java8

import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us =
                NumberFormat.getCurrencyInstance(Locale.US);

        NumberFormat india =
                NumberFormat.getCurrencyInstance(indiaLocale);

        NumberFormat china =
                NumberFormat.getCurrencyInstance(Locale.CHINA);

        NumberFormat france =
                NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String usPayment = us.format(payment);
        String indiaPayment = india.format(payment);
        String chinaPayment = china.format(payment);
        String francePayment = france.format(payment);

        System.out.println("US: " + usPayment);
        System.out.println("India: " + indiaPayment);
        System.out.println("China: " + chinaPayment);
        System.out.println("France: " + francePayment);
    }
}
