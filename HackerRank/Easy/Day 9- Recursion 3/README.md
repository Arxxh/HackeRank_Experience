# Day 9: Recursion 3  

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Day 9: Recursion 3  ](https://www.hackerrank.com/challenges/30-recursion/problem)

## Problem Description

**Objective** **
Today, we are learning about an algorithmic concept called *recursion*. Check out the [Tutorial](/challenges/30-recursion/tutorial) tab for learning materials and an instructional video.

Recursive Method for Calculating Factorial** **

Function Description** **
Complete the *factorial* function in the editor below.  Be sure to use recursion.

*factorial* has the following paramter:

* *int n:* an integer

Returns**

* *int:* the factorial of

**Note:** If you fail to use recursion or fail to name your recursive function *factorial* or *Factorial*, you will get a score of .

**Input Format**

A single integer,  (the argument to pass to *factorial*).

**Constraints**

*

* Your submission must contain a recursive function named *factorial*.

**Sample Input**

```
3

```

**Sample Output**

```
6

```

**Explanation**

Consider the following steps.  After the recursive calls from step 1 to 3, results are accumulated from step 3 to 1.

*

*

*

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Day 9: Recursion 3  
// Link: https://www.hackerrank.com/challenges/30-recursion/problem
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

class Result {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
