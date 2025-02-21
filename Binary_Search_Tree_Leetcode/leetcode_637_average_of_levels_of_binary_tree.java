package Binary_Search_Tree_Leetcode;

import Binary_Search_Tree.*;
import java.util.*;
public class leetcode_637_average_of_levels_of_binary_tree 
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
        System.out.println(averageOfLevels(bst.root));
    }
    public static List<Double> averageOfLevels(TNode t)
    {
        List<Double> al=new ArrayList<>();
        mine_calc(t,al);
        return al;
        
    }
    static void mine_calc(TNode t,List<Double>al)
    {
        Deque<TNode> dq=new ArrayDeque<>();
        dq.addLast(t);
        while(!dq.isEmpty())
        {
            int len=dq.size();
            double sum=0;
            for(int i=0;i<len;i++)
            {
                TNode td=dq.removeFirst();
                sum=sum+td.val;
                if(td.left!=null)
                dq.addLast(td.left);
                if(td.right!=null)
                dq.addLast(td.right);
            }
            al.add(sum/len);
        }
    }
}
