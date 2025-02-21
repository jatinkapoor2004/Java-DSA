package Binary_Search_Tree_Leetcode;

import Binary_Search_Tree.*;

public class leetcode_938_range_sum_of_BST 
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
        System.out.println(rangeSumBST(bst.root, 20, 60));
    }
    public static int rangeSumBST(TNode root, int low, int high) 
    {
        int a[]={0};
        range_sum(root, low, high,a);
        return a[0];
    }
    static void range_sum(TNode t,int low,int high,int a[])
    {
        if(t==null)
        {
        }
        else
        {
            if(t.val>=low && t.val<=high)
            {
                //System.out.println(t.val+" is added");
                a[0]+=t.val;
            }
            if(t.val>low)//back tracking if node's val is small than val then no need of left recursion 
            range_sum(t.left, low, high, a);
            if(t.val<high)//similarly if node's val is greater than val then no nood of right recursion 
            range_sum(t.right, low, high, a);
        }
    }
}
