// HackerRank Problem: Day 7: Arrays
// Link: https://www.hackerrank.com/challenges/30-arrays/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
            
        Stack<Integer> stack = new Stack<>(); // the stack trick
        
        for (int i = 0; i < arr.size(); i++){
            stack.push(arr.get(i));
        }
        
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
    }
    
        bufferedReader.close();
    }
}
