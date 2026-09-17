// HackerRank Problem:  Java Stdin and Stdout I
// Link: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int myint1 = scanner.nextInt();
        int myint2 = scanner.nextInt();
        int myint3 = scanner.nextInt();
        scanner.close();
        
        System.out.println(myint1);
        System.out.println(myint2);
        System.out.println(myint3);
    }
}
