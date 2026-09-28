// HackerRank Problem: Day 8: Dictionaries and Maps
// Link: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        HashMap<String, Integer> agenda = new HashMap<>();
        
        for (int i = 0; i < n; i++) 
        {
            String nombre = scanner.next();
            int telefono = scanner.nextInt();
            
            agenda.put(nombre, telefono);
        }
        
        while (scanner.hasNext()) {
            
            String consulta = scanner.next();
            
            if (agenda.containsKey(consulta)){
                System.out.println(consulta + "=" + agenda.get(consulta));
            } else {
                System.out.println("Not found");
            }
        }
        
        scanner.close();
    }
}
