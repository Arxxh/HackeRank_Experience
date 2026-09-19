# Tree: Postorder Traversal

**Difficulty:** Easy  
**Topics:** N/A  
**HackerRank URL:** [Tree: Postorder Traversal](https://www.hackerrank.com/challenges/tree-postorder-traversal/problem)

## Problem Description

Complete the  function in the editor below.  It received  parameter: a pointer to the root of a binary tree. It must print the values in the tree's postorder traversal as a single line of space-separated values.

**Input Format**

Our test code passes the root node of a binary tree to the  function.

**Constraints**

 Nodes in the tree

**Output Format**

Print the tree's postorder traversal as a single line of space-separated values.

**Sample Input**

```
     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4

```

**Sample Output**

```
4 3 6 5 2 1

```

**Explanation**

The postorder traversal is shown.

## Examples



## Constraints



## Solution

```java15
// HackerRank Problem: Tree: Postorder Traversal
// Link: https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
// Difficulty: Easy
// Language: java15

import java.io.*;
import java.util.*;

public class Solution {
    
    static class Node { 
        int data; 
        Node Left;
        Node Right; 
        
        
        Node(int data){ 
            this.data = data; 
        }
    }
    
    public static Node insert(Node root, int data) {

    if (root == null) {
        return new Node(data);
    } 
    if (data <= root.data) { 
        root.Left = insert(root.Left, data); 
    } else {
        root.Right = insert(root.Right, data);
    }

    return root; 
}
    
    public static void postOrder(Node root){
        if (root == null){
            return; 
        } 
        
        postOrder(root.Left); 
        postOrder(root.Right); 
        
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cantidad = scanner.nextInt();
        
        Node root = null;
        
        for (int i = 0; i < cantidad; i++){
            int data = scanner.nextInt();
            root = insert(root, data);
        }
        
        postOrder(root);
        
        scanner.close();
        
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
