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
