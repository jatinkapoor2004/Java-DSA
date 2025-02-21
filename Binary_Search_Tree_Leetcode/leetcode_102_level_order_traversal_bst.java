package Binary_Search_Tree_Leetcode;

import Binary_Search_Tree.*;
import java.util.ArrayList;
import java.util.List;

public class leetcode_102_level_order_traversal_bst 
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
         System.out.println(levelOrder(bst.root));
    }
    public static List<List<Integer>> levelOrder(TNode root) 
    {
        java.util.Deque<TNode> dq=new java.util.ArrayDeque<>();
        dq.addLast(root);
        List<List<Integer>> mainlist=new ArrayList<>();
        while(!dq.isEmpty())
        {           
            List<Integer>al=new ArrayList<>();
            int len=dq.size();
            for(int i=0;i<len;i++)
            {
                TNode t=dq.removeFirst();
                al.add(t.val);
                if(t.left!=null)
                    dq.addLast(t.left);
                if(t.right!=null)
                    dq.addLast(t.right);
                //dq.removeFirst();
            }
            mainlist.add(al);
        }
        return mainlist;
    }
}    
//    static void mine(TNode t,Deque<TNode> dq,List<List<Integer>>mainlist,List<Integer>al)
//    {
//        if(t==null){}
//        else
//        {
//          while(dq.isEmpty())
//          {
//              al.add(dq.getFirst().val);
//              dq.removeFirst();
//          }
//            dq.addLast(t.left);
//            dq.addLast(t.right);
//            mine(t.left, dq, mainlist, al);
//            mine(t.right, dq, mainlist, al);
//        }
//    }
//    static void levels(TNode t,List<List<Integer>> mainlist)
//    {
//        int height1=height(t);
//        for(int i=0;i<height1;i++)
//        {
//            ArrayList<Integer>al=new ArrayList<>();
//            print_nodes_at_levels(t, i, 0, al);
//            mainlist.add(al);
//        }
//    }
//    static void print_nodes_at_levels(TNode t,int level,int i,ArrayList<Integer>al)
//    {
//        if(t==null)
//        {
//            
//        }
//        else if(i>level)
//        {
//            
//        }
//        else if(i<=level)
//        {
//            if(i==level)
//            {
//                al.add(t.val);
//            }
//            print_nodes_at_levels(t.left, level, i+1,al);
//            print_nodes_at_levels(t.right, level, i+1,al);
//        }
//    }
//    public static int height(TNode t)
//    {
//        if(t==null)
//        {
//            return 0;
//        }
////        if(t.left==null && t.right==null)
////        {
////            return 1;
////        }
//        else
//        {
//            int h1=height(t.left)+1;
//            int h2=height(t.right)+1;
//            return Math.max(h1, h2);
//        }
//    }
//    
//}
