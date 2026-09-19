# Java Int to String

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Java Int to String](https://www.hackerrank.com/challenges/java-int-to-string/problem)

## Problem Description

You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "*Good job*". Otherwise it will print "*Wrong answer*".

 can range between  to  inclusive.

**Sample Input 0**

```
100

```

**Sample Output 0**

```
Good job

```

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Java Int to String
// Link: https://www.hackerrank.com/challenges/java-int-to-string/problem
// Difficulty: Easy
// Language: java15

import java.util.*;

public class Solution {

    public static String convertInt(int n) {
        String s = Integer.toString(n);
        return s;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String s = convertInt(n);

        if (s.equals(Integer.toString(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong Answer");
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
