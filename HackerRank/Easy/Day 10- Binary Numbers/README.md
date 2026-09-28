# Day 10: Binary Numbers

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Day 10: Binary Numbers](https://www.hackerrank.com/challenges/30-binary-numbers/problem)

## Problem Description

**Objective** **
Today, we're working with binary numbers. Check out the [Tutorial](/challenges/30-binary-numbers/tutorial) tab for learning materials and an instructional video!

Task** **
Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation. When working with different bases, it is common to show the base as a subscript.

Example** **

The binary representation of  is .  In base , there are  and  consecutive ones in two groups.  Print the maximum, .

Input Format**

A single integer, .

**Constraints**

*

**Output Format**

Print a single base- integer that denotes the maximum number of consecutive 's in the binary representation of .

**Sample Input 1**

```
5

```

**Sample Output 1**

```
1

```

**Sample Input 2**

```
13

```

**Sample Output 2**

```
2

```

**Explanation**

*Sample Case 1:*

The binary representation of  is , so the maximum number of consecutive 's is .

*Sample Case 2:*

The binary representation of  is , so the maximum number of consecutive 's is .

## Examples



## Constraints



## Solution

```java15
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


```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
