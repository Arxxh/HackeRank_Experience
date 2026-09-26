// HackerRank Problem: Day 6: Let's Review
// Link: https://www.hackerrank.com/challenges/30-review-loop/problem
// Difficulty: Easy
// Language: java

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int caso = 0; caso < t; caso++) {
            
        String s = scanner.next();
        
        String pares = "";
        String impares = "";
        
        for (int i = 0; i < s.length(); i++){
            
            if (i % 2 == 1){ // impar odd
                impares += s.charAt(i);
            } else {
                pares += s.charAt(i);
            }
        }
        
        System.out.println(pares + " " + impares);
        
        
        
        
    }
    
    scanner.close();
}

}
