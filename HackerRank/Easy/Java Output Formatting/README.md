# Java Output Formatting

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Java Output Formatting](https://www.hackerrank.com/challenges/java-output-formatting/problem)

## Problem Description

Java's *System.out.printf* function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using *printf*.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

**Input Format**

Every line of input will contain a *String* followed by an *integer*. **
Each *String* will have a maximum of  alphabetic characters, and each *integer* will be in the inclusive range from  to .

Output Format**

In each line of output there should be two columns: **
The first column contains the *String* and is left justified using exactly  characters.

The second column contains the *integer*, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input**

```
java 100
cpp 65
python 50

```

**Sample Output**

```
================================
java           100
cpp            065
python         050
================================

```

**Explanation**

Each *String* is left-justified with trailing whitespace through the first  characters. The leading digit of the *integer* is the  character, and each *integer* that was less than  digits now has leading zeroes.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Java Output Formatting
// Link: https://www.hackerrank.com/challenges/java-output-formatting/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        // %-15s%03d%n: formato 15 espacios a la derecha string
        //luego 3 numeros enteros y sino rellanrlos con ceros
        //finalmetne %n salto de linea
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        
        for(int i = 0; i < 3; i++)
        {
            String text = scanner.next();
            int number = scanner.nextInt();
            System.out.printf("%-15s%03d%n", text, number);
        }
        
        System.out.println("================================");
        scanner.close();
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
