// HackerRank Problem: Day 10: Binary Numbers
// Link: https://www.hackerrank.com/challenges/30-binary-numbers/problem
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
        
        String binary = Integer.toBinaryString(n);
        
        int contador = 0;
        int maximo = 0;
        
        for (int i = 0; i < binary.length(); i++){
            if (binary.charAt(i) == '1'){
                contador++;
                if (contador > maximo){
                    maximo = contador;
                }
            } else {
                contador = 0;
            }
        }
        
        System.out.println(maximo);
        
        bufferedReader.close();
}

    }

