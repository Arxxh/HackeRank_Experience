// HackerRank Problem: Java Loops II
// Link: https://www.hackerrank.com/challenges/java-loops/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int query = 0; query < q; query++)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int current = a;
            int power = 1; // representa 2^0

            for (int i = 0; i < n; i++)
            {
                current += power * b;

                System.out.print(current + " ");

                power *= 2;
            }

            System.out.println();
        }

        scanner.close();
    }
}
