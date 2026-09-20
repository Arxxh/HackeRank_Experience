// HackerRank Problem: Tree: Inorder Traversal
// Link: https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
// Difficulty: Easy
// Language: cpp



/* you only have to complete the function given below.  
Node is defined as  

class Node {
    public:
        int data;
        Node *left;
        Node *right;
        Node(int d) {
            data = d;
            left = NULL;
            right = NULL;
        }
};

*/

   void inOrder(Node *root) {
         if(root) {
            inOrder(root->left);
            cout << root->data << " ";
            inOrder(root->right);
        }
    }
