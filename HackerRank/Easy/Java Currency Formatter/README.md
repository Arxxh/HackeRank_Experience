# Java Currency Formatter

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Java Currency Formatter](https://www.hackerrank.com/challenges/java-currency-formatter/problem)

## Problem Description

Given a [double-precision](https://en.wikipedia.org/wiki/Double-precision_floating-point_format) number, , denoting an amount of money, use the [NumberFormat](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html) class' [getCurrencyInstance](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getCurrencyInstance-java.util.Locale-) method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

```
US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment

```

where  is  formatted according to the appropriate [Locale](https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)'s currency.

**Note:** India does not have a built-in Locale, so you must [construct one](https://docs.oracle.com/javase/8/docs/api/java/util/Locale.html#Locale-java.lang.String-java.lang.String-) where the language is `en` (i.e., English).

**Input Format**

A single double-precision number denoting .

**Constraints**

*

**Output Format**

On the first line, print `US: u` where  is  formatted for US currency. **
On the second line, print `India: i` where  is  formatted for Indian currency.

On the third line, print `China: c` where  is  formatted for Chinese currency.

On the fourth line, print `France: f`, where  is  formatted for French currency.

Sample Input**

```
12324.134

```

**Sample Output**

```
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €

```

**Explanation**

Each line contains the value of  formatted according to the four countries' respective currencies.

## Examples



## Constraints



## Solution

```java8
// HackerRank Problem: Java Currency Formatter
// Link: https://www.hackerrank.com/challenges/java-currency-formatter/problem
// Difficulty: Easy
// Language: java8

import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us =
                NumberFormat.getCurrencyInstance(Locale.US);

        NumberFormat india =
                NumberFormat.getCurrencyInstance(indiaLocale);

        NumberFormat china =
                NumberFormat.getCurrencyInstance(Locale.CHINA);

        NumberFormat france =
                NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String usPayment = us.format(payment);
        String indiaPayment = india.format(payment);
        String chinaPayment = china.format(payment);
        String francePayment = france.format(payment);

        System.out.println("US: " + usPayment);
        System.out.println("India: " + indiaPayment);
        System.out.println("China: " + chinaPayment);
        System.out.println("France: " + francePayment);
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
