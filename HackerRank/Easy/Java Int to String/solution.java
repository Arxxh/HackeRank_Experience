// HackerRank Problem: Java Int to String
// Link: https://www.hackerrank.com/challenges/java-int-to-string/problem
// Difficulty: Easy
// Language: java15

import java.util.*;

public class Solution {

    public static String convertInt(int n) {
        String s = Integer.toString(n);
        return s;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String s = convertInt(n);

        if (s.equals(Integer.toString(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong Answer");
        }

        scanner.close();
    }
}
