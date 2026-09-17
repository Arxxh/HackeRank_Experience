// HackerRank Problem: Java End-of-file
// Link: https://www.hackerrank.com/challenges/java-end-of-file/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        
        while (scanner.hasNextLine()) {
            
            String lectura = scanner.nextLine();
            contador++;
            System.out.print(contador + " " + lectura + "\n");
            
        }
        
        scanner.close();
        
    }   
    
    
}
