# Day 11: 2D Arrays

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Day 11: 2D Arrays](https://www.hackerrank.com/challenges/30-2d-arrays/problem)

## Problem Description

**Objective** **
Today, we are building on our knowledge of *arrays* by adding another dimension. Check out the [Tutorial](/challenges/30-2d-arrays/tutorial) tab for learning materials and an instructional video.

Context** **
Given a  *2D Array*, :

```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

```

We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

```
a b c
  d
e f g

```

There are  hourglasses in , and an *hourglass sum* is the sum of an hourglass' values.

Task** **
Calculate the hourglass sum for every hourglass in , then print the *maximum* hourglass sum.

Example**

In the array shown above, the maximum hourglass sum is  for the hourglass in the top left corner.

**Input Format**

There are  lines of input, where each line contains  space-separated integers that describe the *2D Array* .

**Constraints**

*

*

**Output Format**

Print the maximum hourglass sum in .

**Sample Input**

```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

```

**Sample Output**

```
19

```

**Explanation**

 contains the following hourglasses:

```
1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0

```

The hourglass with the maximum sum () is:

```
2 4 4
  2
1 2 4

```

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Day 11: 2D Arrays
// Link: https://www.hackerrank.com/challenges/30-2d-arrays/problem
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

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int maximo = Integer.MIN_VALUE;

for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {

        int suma =
              arr.get(i).get(j)
            + arr.get(i).get(j + 1)
            + arr.get(i).get(j + 2)

            + arr.get(i + 1).get(j + 1)

            + arr.get(i + 2).get(j)
            + arr.get(i + 2).get(j + 1)
            + arr.get(i + 2).get(j + 2);

        if (suma > maximo) {
            maximo = suma;
        }
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
