package Binary_Search_Tree_Leetcode;

import Binary_Search_Tree.*;

public class leetcode_404_sum_of_left_leaves 
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
        System.out.println(sumOfLeftLeaves(bst.root));
    }
    public static int sumOfLeftLeaves(TNode t)
    {
        int a[]={0};
        //counting(t,a,false);
        method2(t, a, null);
        return a[0];
    }
    static void counting(TNode t,int a[],boolean isLeft)
    {
       if(t==null)
       {
           
       }
       else if(t.left==null && t.right==null && isLeft==true)
       {
           System.out.println(t.val);
           a[0]=a[0]+t.val;
       }
       else
       {
           counting(t.left, a, true);
           counting(t.right, a, false);
       }
    }
    
    static void method2(TNode t,int a[],TNode parent)
    {
        if(t==null)
        {
            //return;
        }
        else if(t.left==null && t.right==null)
        {
            if(parent!=null  && parent.left==t)
            //System.out.println(t.val);
            a[0]+=t.val;
        }
        else
        {
            method2(t.left, a, t);
            method2(t.right, a, t);
        }
    }
    
}
