// HackerRank Problem: Solve Me First
// Link: https://www.hackerrank.com/challenges/solve-me-first/problem
// Difficulty: Easy
// Language: java15

import java.util.*;

public class Solution {

    static int solveMeFirst(int a, int b) {
      return a + b;
	}

  
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        in.close();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
	}
}
