// HackerRank Problem: Java Substring
// Link: https://www.hackerrank.com/challenges/java-substring/problem
// Difficulty: Easy
// Language: java

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String resultado = S.substring(start, end);
        System.out.println(resultado);
        
        in.close();
    }
}
