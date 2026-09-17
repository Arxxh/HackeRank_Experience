// HackerRank Problem: Java Output Formatting
// Link: https://www.hackerrank.com/challenges/java-output-formatting/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        // %-15s%03d%n: formato 15 espacios a la derecha string
        //luego 3 numeros enteros y sino rellanrlos con ceros
        //finalmetne %n salto de linea
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        
        for(int i = 0; i < 3; i++)
        {
            String text = scanner.next();
            int number = scanner.nextInt();
            System.out.printf("%-15s%03d%n", text, number);
        }
        
        System.out.println("================================");
        scanner.close();
    }
}
