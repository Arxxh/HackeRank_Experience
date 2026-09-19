# Day 1: Data Types

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Day 1: Data Types](https://www.hackerrank.com/challenges/30-data-types/problem)

## Problem Description

**Objective** **
Today, we're discussing data types. Check out the [Tutorial](/challenges/30-data-types/tutorial) tab for learning materials and an instructional video!

Task** **
Complete the code in the editor below. The variables , , and  are already declared and initialized for you. You must:

* Declare  variables: one of type *int*, one of type *double*, and one of type *String*.

* Read  lines of input from stdin (according to the sequence given in the *Input Format* section below) and initialize your  variables.

* Use the  operator to perform the following operations:
 Print the sum of  plus your int variable on a new line.

* Print the sum of  plus your double variable to a scale of one decimal place on a new line.

* Concatenate  with the string you read as input and print the result on a new line.

Note:** If you are using a language that doesn't support using  for string concatenation (e.g.: C), you can just print one variable immediately following the other on the same line. The string provided in your editor *must* be printed first, immediately followed by the string you read as input.

**Input Format**

The first line contains an integer that you must sum with . **
The second line contains a double that you must sum with .

The third line contains a string that you must concatenate with .

Output Format**

Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line, and then the two concatenated strings on the third line.

**Sample Input**

```
12
4.0
is the best place to learn and practice coding!

```

**Sample Output**

```
16
8.0
HackerRank is the best place to learn and practice coding!

```

**Explanation**

When we sum the integers  and , we get the integer . **
When we sum the floating-point numbers  and , we get .

When we concatenate `HackerRank ` with `is the best place to learn and practice coding!`, we get `HackerRank is the best place to learn and practice coding!`.

You will not pass this challenge if you attempt to assign the *Sample Case* values to your variables instead of following the instructions above and reading input from stdin.**

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Day 1: Data Types
// Link: https://www.hackerrank.com/challenges/30-data-types/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {
    
    
    public static int sum(int res){
        return res + 4;
    }
    
    public static double sum(double res){
        return res + 4.0;
    }
    
    public static String conc(String res) {
    return "HackerRank " + res;
}

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        
        scanner.nextLine();
        String s = scanner.nextLine();
    
        scanner.close();
        
        i = sum(i);
        d = sum(d);
        s = conc(s);
        
        System.out.println(i + "\n" + d + "\n" + s);
        
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
