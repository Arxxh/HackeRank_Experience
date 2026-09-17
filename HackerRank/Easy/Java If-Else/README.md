# Java If-Else

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Java If-Else](https://www.hackerrank.com/challenges/java-if-else/problem)

## Problem Description

In this challenge, we test your knowledge of using *if-else* conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

*

Source: [Wikipedia](https://en.wikipedia.org/wiki/Conditional_%28computer_programming%29)

**Task** **
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

Sample Case 0:*

 is odd and odd numbers are weird, so we print `Weird`.

*Sample Case 1:*

 and  is even, so it isn't weird. Thus, we print `Not Weird`.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Java If-Else
// Link: https://www.hackerrank.com/challenges/java-if-else/problem
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



public class Solution // clase
{
    public static void main(String[] args) throws IOException //metodo
    
    { // instrucciones
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if(N % 2 != 0){
            System.out.println("Weird");
        } else if (N % 2 == 0 && N >= 2 && N <= 5){
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && N >= 6 && N <= 20){
            System.out.println("Weird");
        } else if (N % 2 == 0 && N >= 20){
            System.out.println("Not Weird");
        } else {
            System.out.println("Invalid Number or input");
        }

        bufferedReader.close();
    }
    
    
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
