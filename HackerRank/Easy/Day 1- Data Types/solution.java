// HackerRank Problem: Day 1: Data Types
// Link: https://www.hackerrank.com/challenges/30-data-types/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {
    
    
    public static int sum(int res){
        return res + 4;
    }
    
    public static double sum(double res){
        return res + 4.0;
    }
    
    public static String conc(String res) {
    return "HackerRank " + res;
}

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        
        scanner.nextLine();
        String s = scanner.nextLine();
    
        scanner.close();
        
        i = sum(i);
        d = sum(d);
        s = conc(s);
        
        System.out.println(i + "\n" + d + "\n" + s);
        
    }
}
