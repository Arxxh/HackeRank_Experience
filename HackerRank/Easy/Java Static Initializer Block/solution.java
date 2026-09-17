// HackerRank Problem: Java Static Initializer Block
// Link: https://www.hackerrank.com/challenges/java-static-initializer-block/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    static int base;
    static int altura;
    static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);

        base = scanner.nextInt();
        altura = scanner.nextInt();

        if (base > 0 && altura > 0) {
            flag = true;
        } else {
            flag = false;
            System.out.println(
                "java.lang.Exception: Breadth and height must be positive"
            );
        }
    }

    public static void main(String[] args) {

        if (flag) {
            int area = base * altura;
            System.out.println(area);
        }
    }
}
