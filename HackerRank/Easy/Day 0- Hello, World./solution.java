// HackerRank Problem: Day 0: Hello, World.
// Link: https://www.hackerrank.com/challenges/30-hello-world/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String inputString = scanner.nextLine();
        System.out.println("Hello, World.");
        System.out.println(inputString);
        
        scanner.close();
    }
}
