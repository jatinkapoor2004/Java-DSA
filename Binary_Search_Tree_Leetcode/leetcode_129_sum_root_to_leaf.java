package Binary_Search_Tree_Leetcode;

import Binary_Search_Tree.*;
import java.util.StringTokenizer;

public class leetcode_129_sum_root_to_leaf 
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
        System.out.println(sumNumbers(bst.root));
    }
    public static long sumNumbers(TNode root) 
    {
        long sum[]={0};
        mine(root, "", sum);
        return sum[0];
    }
    public static void mine(TNode t,String ans,long sum[])
    {
        if(t==null)
        {
            
        }
        else if(t.left==null && t.right==null)
        {
            ans=ans+t.val;
            sum[0]+=Long.parseLong(ans);
        }
        else
        {
            mine(t.left, ans+t.val, sum);
            mine(t.right, ans+t.val, sum);
        }
    }
}
