// HackerRank Problem: Java Stdin and Stdout II
// Link: https://www.hackerrank.com/challenges/java-stdin-stdout/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int myint1 = scanner.nextInt();
        double mydouble = scanner.nextDouble();
        scanner.nextLine();
        String mystring = scanner.nextLine();
        scanner.close();
        
        System.out.println("String: " + mystring);
        System.out.println("Double: " + mydouble);
        System.out.println("Int: " + myint1);
    


        
    }
}
