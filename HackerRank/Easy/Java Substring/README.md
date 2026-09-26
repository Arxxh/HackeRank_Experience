# Java Substring

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Java Substring](https://www.hackerrank.com/challenges/java-substring/problem)

## Problem Description

Given a string, , and two indices,  and , print a [substring](https://en.wikipedia.org/wiki/Substring) consisting of all characters in the inclusive range from  to . You'll find the *String* class' [substring method](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-) helpful in completing this challenge.

**Input Format**

The first line contains a single string denoting . **
The second line contains two space-separated integers denoting the respective values of  and .

Constraints**

*

*

* String  consists of English alphabetic letters (i.e., ) only.

**Output Format**

Print the substring in the inclusive range from  to .

**Sample Input**

```
Helloworld
3 7

```

**Sample Output**

```
lowo

```

**Explanation**

In the diagram below, the substring is highlighted in *green*:

![substring.png](https://s3.amazonaws.com/hr-challenge-images/22039/1470896981-637b6a022f-substring.png)

## Examples



## Constraints



## Solution

```java
// HackerRank Problem: Java Substring
// Link: https://www.hackerrank.com/challenges/java-substring/problem
// Difficulty: Easy
// Language: java

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String resultado = S.substring(start, end);
        System.out.println(resultado);
        
        in.close();
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
