# Java Loops II

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Java Loops II](https://www.hackerrank.com/challenges/java-loops/problem)

## Problem Description

We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

**Input Format**

The first line contains an integer, , denoting the number of queries. **
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints**

*

*

*

**Output Format**

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

**Sample Input**

```
2
0 2 10
5 3 5

```

**Sample Output**

```
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

```

**Explanation**

We have two queries:

*
We use , , and  to produce some series :

*

*

... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.

*
We use , , and  to produce some series :

*

*

*

*

We then print each element of our series as a single line of space-separated values.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Java Loops II
// Link: https://www.hackerrank.com/challenges/java-loops/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int query = 0; query < q; query++)
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int current = a;
            int power = 1; // representa 2^0

            for (int i = 0; i < n; i++)
            {
                current += power * b;

                System.out.print(current + " ");

                power *= 2;
            }

            System.out.println();
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
