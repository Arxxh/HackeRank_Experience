# Day 7: Arrays

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Day 7: Arrays](https://www.hackerrank.com/challenges/30-arrays/problem)

## Problem Description

**Objective** **
Today, we will learn about the *Array* data structure. Check out the [Tutorial](/challenges/30-arrays/tutorial) tab for learning materials and an instructional video.

Task** **
Given an array, , of  integers, print 's elements in *reverse* order as a single line of space-separated numbers.

Example**

Print `4 3 2 1`.  Each integer is separated by one space.

**Input Format**

The first line contains an integer,  (the size of our array). **
The second line contains  space-separated integers that describe array 's elements.

Constraints**

**Constraints**

*

* , where  is the  integer in the array.

**Output Format**

Print the elements of array  in reverse order as a single line of space-separated numbers.

**Sample Input**

```
4
1 4 3 2

```

**Sample Output**

```
2 3 4 1

```

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Day 7: Arrays
// Link: https://www.hackerrank.com/challenges/30-arrays/problem
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

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
            
        Stack<Integer> stack = new Stack<>(); // the stack trick
        
        for (int i = 0; i < arr.size(); i++){
            stack.push(arr.get(i));
        }
        
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
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
