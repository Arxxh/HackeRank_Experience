// HackerRank Problem: Java Strings Introduction
// Link: https://www.hackerrank.com/challenges/java-strings-introduction/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        scanner.close();
        
        System.out.println(A.length() + B.length());
        
        int compareS = A.compareTo(B);
        
        if (compareS > 0) {
            System.out.println("Yes");
            } else {
            System.out.println("No");
        }
        
        System.out.println
        (A.substring(0, 1).toUpperCase() + A.substring(1) + " " +
        B.substring(0, 1).toUpperCase() + B.substring(1));
        
    }
    
}
