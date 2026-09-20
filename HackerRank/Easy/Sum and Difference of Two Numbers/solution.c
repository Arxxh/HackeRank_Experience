// HackerRank Problem: Sum and Difference of Two Numbers
// Link: https://www.hackerrank.com/challenges/sum-numbers-c/problem
// Difficulty: Easy
// Language: c

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    
    int a,b;
    float c,d;
    
    scanf("%d %d %f %f",&a,&b,&c,&d);
    int suma_int = a + b;
    int resta_int = a - b; 
    float suma_flotante = c + d;
    float resta_flotante = c - d;
    
    printf("%d %d\n", suma_int, resta_int);
    printf("%.1f %.1f", suma_flotante, resta_flotante);
   

return 0;

}
