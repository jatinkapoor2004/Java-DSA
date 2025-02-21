package Binary_Search_Tree;
public class BST_Functions 
{
    public TNode root;
    public void add(int val)
    {
        TNode t=root;
        if(isEmpty(t))//adding first element
        {
            TNode nd=new TNode(val);
            root=nd;
            //System.out.println("first node is added as "+val);
        }
        else
        {
            while(true)
            {
                if(val==t.val)
                {
                    //do nothing bcoz it's a duplicate
                    //System.out.println("duplicate found !!");
                    break;
                }
                else if(val<t.val)
                {
                    if(t.left==null)
                    {
                        TNode nd=new TNode(val);
                        t.left=nd;
                        //System.out.println(val+" is added as left child of "+t.val);
                        break;
                    }
                    else
                    {
                        t=t.left;
                    }
                }
                else if(val>t.val)
                {
                    if(t.right==null)
                    {
                        TNode nd=new TNode(val);
                        t.right=nd;
                        //System.out.println(val+" is added as right child of "+t.val);
                        break;
                    }
                    else
                    {
                        t=t.right;
                    }
                }
            }
        }
    }
    
    public boolean isEmpty(TNode t)
    {
        return t==null;
    }
    
    public void visit_Inorder(TNode t)
    {
        if(t==null)
            return;
        else
        {
            visit_Inorder(t.left);
            System.out.print(t.val+" , ");
            visit_Inorder(t.right);
        }
    }
    
    public void visit_Preorder(TNode t)
    {
        if(t==null)
            return;
        else
        {
            System.out.print(t.val+" , ");
            visit_Preorder(t.left);
            visit_Preorder(t.right);
        }
    }
    
    public void visit_Postorder(TNode t)
    {
        if(t==null)
            return;
        else
        {
            visit_Postorder(t.left);
            visit_Postorder(t.right);
            System.out.print(t.val+" , ");
        }
    }
    
    public int size(TNode t)
    {
        int a[]={0};
        docounting(t,a);
        return a[0];
    }
    
    public void docounting(TNode t,int a[])
    {
        if(t==null)
        {
            //do nothing 
        }
        else
        {
            a[0]++;
            docounting(t.left, a);
            docounting(t.right, a);
        }
    }
    
    public int size_head(TNode t)
    {
        if(t==null)
        {
            return 0;
        }
        else
        {
            return 1+size_head(t.left)+size_head(t.right);
        }
    }
    
    public void leaves(TNode t)
    {
        if(t==null)
        {
            //It is needed to stop null pointer exception on T bcoz T can be null
            return;
        }
        if(t.left==null && t.right==null)
        {
            System.out.print(t.val+" , ");
        }
        else
        {
            leaves(t.left);
            leaves(t.right);
        }
    }
    public int height(TNode t)
    {
        if(t==null)
        {
            return 0;
        }
//        if(t.left==null && t.right==null)
//        {
//            return 1;
//        }
        else
        {
            int h1=height(t.left)+1;
            int h2=height(t.right)+1;
            return Math.max(h1, h2);
        }
    }
}
