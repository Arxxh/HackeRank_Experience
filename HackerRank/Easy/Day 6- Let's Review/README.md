# Day 6: Let's Review

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Day 6: Let's Review](https://www.hackerrank.com/challenges/30-review-loop/problem)

## Problem Description

**Objective** **
Today we will expand our knowledge of strings, combining it with what we have already learned about loops. Check out the [Tutorial](/challenges/30-review-loop/tutorial) tab for learning materials and an instructional video.

Task** **
Given a string, , of length  that is indexed from  to , print its *even-indexed* and *odd-indexed* characters as  space-separated strings on a single line (see the *Sample* below for more detail).

Note:**  is considered to be an *even* index.

**Example**

Print `abc def`

**Input Format**

The first line contains an integer,  (the number of test cases). **
Each line  of the  subsequent lines contain a string, .

Constraints**

*

*

**Output Format**

For each String  (where ), print 's *even-indexed* characters, followed by a space, followed by 's *odd-indexed* characters.

**Sample Input**

```
2
Hacker
Rank

```

**Sample Output**

```
Hce akr
Rn ak

```

**Explanation**

*Test Case 0*:

The *even* indices are , , and , and the *odd* indices are , , and . We then print *a single line* of  space-separated strings; the first string contains the ordered characters from 's *even* indices (), and the second string contains the ordered characters from 's *odd* indices ().

*Test Case 1*:

The *even* indices are  and , and the *odd* indices are  and . We then print *a single line* of  space-separated strings; the first string contains the ordered characters from 's *even* indices (), and the second string contains the ordered characters from 's *odd* indices ().

## Examples



## Constraints



## Solution

```java
// HackerRank Problem: Day 6: Let's Review
// Link: https://www.hackerrank.com/challenges/30-review-loop/problem
// Difficulty: Easy
// Language: java

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int caso = 0; caso < t; caso++) {
            
        String s = scanner.next();
        
        String pares = "";
        String impares = "";
        
        for (int i = 0; i < s.length(); i++){
            
            if (i % 2 == 1){ // impar odd
                impares += s.charAt(i);
            } else {
                pares += s.charAt(i);
            }
        }
        
        System.out.println(pares + " " + impares);
        
        
        
        
    }
    
    scanner.close();
}

}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
