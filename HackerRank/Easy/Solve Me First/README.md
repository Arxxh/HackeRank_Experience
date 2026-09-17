# Solve Me First

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Solve Me First](https://www.hackerrank.com/challenges/solve-me-first/problem)

## Problem Description

Complete the function  to compute the sum of two integers.

**Example** **

Return .

Function Description**

Complete the  function with the following parameters:

* : the first value

* : the second value

Returns **
- : the sum of  and

Constraints**

**Sample Input**

```
a = 2
b = 3

```

**Sample Output**

```
5

```

**Explanation**

.

## Examples



## Constraints



## Solution

```java15
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

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
