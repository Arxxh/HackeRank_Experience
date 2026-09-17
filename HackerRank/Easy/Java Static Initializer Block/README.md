# Java Static Initializer Block

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Java Static Initializer Block](https://www.hackerrank.com/challenges/java-static-initializer-block/problem)

## Problem Description

Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of *Static initialization blocks*. You can read about it [here.](https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html)

You are given a class *Solution* with a *main* method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.

If  or  , the output should be *"java.lang.Exception: Breadth and height must be positive"* without quotes.

**Input Format**

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

**Constraints**

*

*

**Output Format**

If both values are greater than zero, then the *main* method must output the area of the *parallelogram*. Otherwise, print *"java.lang.Exception: Breadth and height must be positive"* without quotes.

**Sample input 1**

```
1
3

```

**Sample output 1**

```
3

```

**Sample input 2**

```
-1
2

```

**Sample output 2**

```
java.lang.Exception: Breadth and height must be positive

```

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Java Static Initializer Block
// Link: https://www.hackerrank.com/challenges/java-static-initializer-block/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    static int base;
    static int altura;
    static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);

        base = scanner.nextInt();
        altura = scanner.nextInt();

        if (base > 0 && altura > 0) {
            flag = true;
        } else {
            flag = false;
            System.out.println(
                "java.lang.Exception: Breadth and height must be positive"
            );
        }
    }

    public static void main(String[] args) {

        if (flag) {
            int area = base * altura;
            System.out.println(area);
        }
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
