# Day 3: Intro to Conditional Statements

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Day 3: Intro to Conditional Statements](https://www.hackerrank.com/challenges/30-conditional-statements/problem)

## Problem Description

**Objective** **
In this challenge, we learn about conditional statements. Check out the [Tutorial](/challenges/30-conditional-statements/tutorial) tab for learning materials and an instructional video.

Task** **
Given an integer, , perform the following conditional actions:

* If  is odd, print `Weird`

* If  is even and in the inclusive range of  to , print `Not Weird`

* If  is even and in the inclusive range of  to , print `Weird`

* If  is even and greater than , print `Not Weird`

Complete the stub code provided in your editor to print whether or not  is weird.

Input Format**

A single line containing a positive integer, .

**Constraints**

*

**Output Format**

Print `Weird` if the number is weird; otherwise, print `Not Weird`.

**Sample Input 0**

```
3

```

**Sample Output 0**

```
Weird

```

**Sample Input 1**

```
24

```

**Sample Output 1**

```
Not Weird

```

**Explanation**

*Sample Case 0:*

 is odd and odd numbers are weird, so we print `Weird`.

*Sample Case 1:*

 and  is even, so it is not weird. Thus, we print `Not Weird`.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Day 3: Intro to Conditional Statements
// Link: https://www.hackerrank.com/challenges/30-conditional-statements/problem
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

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        
        if (N % 2 == 1){
            System.out.println("Weird");
        } else if (N % 2 == 0 && N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        }
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
