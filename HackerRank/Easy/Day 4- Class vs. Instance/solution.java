// HackerRank Problem: Day 4: Class vs. Instance
// Link: https://www.hackerrank.com/challenges/30-class-vs-instance/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {
    
    static class Person{
        
        private int age;
        
        public Person(int initialAge){ // constructor
                    
            if (initialAge < 0 ){
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            } else {
                this.age = initialAge;
            }
        }
        
        public void yearPasses(){
            age++;
        }
        
        public void amIOld(){
            if (age < 13){
                System.out.println("You are young.");
            } else if (age >= 13 && age < 18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }
        }
        
        
    }
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();
        
        for (int i = 0; i < cantidad; i++){
            
            int inputAge = scanner.nextInt();
            
            Person p = new Person(inputAge);
            
            p.amIOld();
            
            for (int j = 0; j < 3; j++){
                p.yearPasses();
            }
            
            p.amIOld();
            
            System.out.println();
            
            
        }
        
        scanner.close();
    }
}
