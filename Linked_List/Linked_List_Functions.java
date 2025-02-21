package Linked_List;
public class Linked_List_Functions 
{
     Node root;
     void add(int n)
    {
        Node nd=new Node(n);
        if(isEmpty(root))
        {
            root=nd;
        }
        else
        {
            Node t=root;
            while(t.next!=null)
            {
                t=t.next;
            }
            t.next=nd;
        }
    }
    
    boolean isEmpty(Node root)
    {
        return root==null;
    }
     
    void print(Node root)
    {
        Node t=root;
        while(t!=null)
        {
            System.out.print(t.val+" --> ");
            t=t.next;
        }
    }
    
    int find(Node root,int val)
    {
        if(root==null)//cornor case
        {
            return -1;
        }
        int index=0;
        Node t=root;
        while(t!=null)
        {
            if(t.val==val)
            {
                return index;
            }
            t=t.next;
            index++;
        }
        return -1;
    }
    
    int size(Node root)
    {
        if(isEmpty(root))return 0;
        Node t=root;
        int size=0;
        while(t!=null)
        {
            size++;
            t=t.next;
        }
        return size;
    }
    
    int getElementAt(int index)
    {
        if(isEmpty(root))
        {
            System.out.println("Index Not Found !!");
            return -1;
        }
        int myindex=0;
        Node t=root;
        while(t!=null)
        {
            if(myindex==index)
                return t.val;
            
                t=t.next;
                myindex++;
        }
        return -1;
        
    }
    
    void addFirst(int val)
    {
        Node nd=new Node(val);
        nd.next=root;
        root=nd;
    }
    
    void update(int old_val,int new_val)
    {
        Node t=root;
        if(t==null)
        {
            System.out.println("LL is empty ");
        }
        else
        {
            while( t!=null )
            {
                if(t.val==old_val)
                {
                    t.val=new_val;
                    System.out.println("Value updated !!");
                    return;
                }
                t=t.next;
            }
            System.out.println("Value not Found !!");
        }
        
    }
    
    void delete(int index)
    {
        int myindex=0;
        if(isEmpty(root) || index>=size(root))
        {
            System.out.println("Index Not Found !! ");
            
        }
        else if(index==0)
            root=root.next;
        else
        {
            Node t=root;
            while(t!=null)
            {
                if(myindex==index-1)
                {
                    t.next=t.next.next;
                    return;
                }
                t=t.next;
                myindex++;
            }
            System.out.println("Index Not found");
        }
    }
}
