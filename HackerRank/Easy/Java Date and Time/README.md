# Java Date and Time

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Java Date and Time](https://www.hackerrank.com/challenges/java-date-and-time/problem)

## Problem Description

The [Calendar class](https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html) is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, , which returns the *day* on that date.  To simplify your task, we have provided a portion of the code in the editor.

**Example** **

The method should return  as the day on that date.

*

Function Description**

Complete the findDay* function in the editor below.

*findDay* has the following parameters:

* *int:* month

* *int:* day

* *int:* year

**Returns**

* *string:* the day of the week in capital letters

**Input Format**

A single line of input containing the space separated month, day and year, respectively, in    format.

**Constraints**

*

**Sample Input**

```
08 05 2015

```

**Sample Output**

```
WEDNESDAY

```

**Explanation**

The day on August th  was `WEDNESDAY`.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Java Date and Time
// Link: https://www.hackerrank.com/challenges/java-date-and-time/problem
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

import java.time.LocalDate;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        LocalDate fecha = LocalDate.of(year, month, day);
        String dia = fecha.getDayOfWeek().name();
        return dia;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
