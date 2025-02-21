package Binary_Search_Tree_Leetcode;

import Binary_Search_Tree.*;
public class leetcode_700_search_in_BST 
{
     public static void main(String[] args) {
        BST_Functions bst =new BST_Functions();
        bst.add(50);
        bst.add(40);
        bst.add(60);
        bst.add(70);
        bst.add(80);
        bst.add(30);
        bst.add(45);
        bst.add(65);
        bst.add(55);
        bst.add(80);
        bst.add(90);
        bst.add(60);
        bst.add(10);
        bst.add(20);
        bst.add(15);
        bst.visit_Inorder(bst.root);
        System.out.println();
        bst.visit_Inorder(searchBST(bst.root, 70));
    }
    public static TNode searchBST(TNode t, int val) 
    {
       if(t==null)
           return null;
       else if(t.val>val)
           return searchBST(t.left, val);
       else if(t.val<val)
           return searchBST(t.right, val);
       else  
            return t;
        
    }
}
