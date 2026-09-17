# Java End-of-file

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Java End-of-file](https://www.hackerrank.com/challenges/java-end-of-file/problem)

## Problem Description

**

"In computing, *End Of File* (commonly abbreviated *EOF*) is a condition in a computer operating system where no more data can be read from a data source."
  — ([Wikipedia: End-of-file](https://en.wikipedia.org/wiki/End-of-file))

The challenge here is to read  lines of input until you reach *EOF*, then number and print all  lines of content.

Hint:** Java's *Scanner.hasNext()* method is helpful for this problem.

**Input Format**

Read some unknown  lines of input from *stdin(System.in)* until you reach *EOF*; each line of input contains a non-empty *String*.

**Output Format**

For each line, print the line number, followed by a single space, and then the line content received as input.

**Sample Input**

```
Hello world
I am a file
Read me until end-of-file.

```

**Sample Output**

```
1 Hello world
2 I am a file
3 Read me until end-of-file.

```

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Java End-of-file
// Link: https://www.hackerrank.com/challenges/java-end-of-file/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        
        while (scanner.hasNextLine()) {
            
            String lectura = scanner.nextLine();
            contador++;
            System.out.print(contador + " " + lectura + "\n");
            
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
