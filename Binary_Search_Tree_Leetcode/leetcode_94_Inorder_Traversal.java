package Binary_Search_Tree_Leetcode;
import Binary_Search_Tree.*;
import java.util.*;
public class leetcode_94_Inorder_Traversal 
{
    public static void main(String[] args)
    {
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
        System.out.println(inorderTraversal(bst.root));
    }
    public static List<Integer> inorderTraversal(TNode root)
    {
        List<Integer> al=new ArrayList<>();
         mine_inorder(root,al);
         return al;   
    }
    static void mine_inorder(TNode t,List<Integer>al)
    {
        if(t==null)
        {
            return;
        }
        else
        {
            mine_inorder(t.left,al);
            al.add(t.val);
            mine_inorder(t.right,al);
        }
    }
}
