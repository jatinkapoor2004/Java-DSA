package Binary_Search_Tree;
public class BST_Testing    
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
//        System.out.print("INORDER IS --> ");
//        bst.visit_Inorder(bst.root);
//        System.out.println();
//        
//        System.out.print("PREORDER IS --> ");
//        bst.visit_Preorder(bst.root);
//        System.out.println();
//        
//        System.out.print("POSTORDER IS --> ");
//        bst.visit_Postorder(bst.root);
//        System.out.println();
//        
//        System.out.println("size of TREE is --> "+bst.size(bst.root));
//        System.out.println("size using head recursion is "+bst.size_head(bst.root));
    
//        System.out.print("leaves of tree are --> ");
//        bst.leaves(bst.root);
//        System.out.println();
//        
//        System.out.println("smallest number is --> "+ smallest(bst.root));
//          System.out.println("height is -->"+bst.height(bst.root));
            print_nodes_at_levels(bst.root, 2, 0);
    }
    static int smallest (TNode t)
    {
        if(t.left==null)
        {
            return t.val;
        }
        else 
        {
            return smallest(t.left);
        }
    }
    
    static void print_nodes_at_levels(TNode t,int level,int i)
    {
        if(t==null)
        {
            
        }
        else if(i>level)
        {
            
        }
        else if(i<=level)
        {
            if(i==level)
            {
                System.out.println(t.val);
            }
            print_nodes_at_levels(t.left, level, i+1);
            print_nodes_at_levels(t.right, level, i+1);
        }
    }
}
