package Linked_List;
public class Leetcode_2_Add_Two_Numbers 
{
    public static void main(String[] args) {
        Linked_List_Functions ll=new Linked_List_Functions();
        ll.add(9);
        ll.add(9);
        ll.add(9);
        ll.add(9);
        ll.add(9);
        ll.add(9);
        ll.add(9);

        //System.out.print(" First List is ---> ");
        printlist(ll.root);
        
        Linked_List_Functions ll2=new Linked_List_Functions();
        ll2.add(9);
        ll2.add(9);
        ll2.add(9);
        ll2.add(9);
        //System.out.print("Second List is ---> ");
        printlist(ll2.root);
        
        printlist(addTwoNumbers(ll.root, ll2.root));
    }
    public static Node addTwoNumbers(Node L1, Node L2) 
    {
        Node t1=L1;
        Node t2=L2;
        Node final1=null;
        Node t3=final1;
        int carry=0;
        while(true)
        {
            System.out.println("loop runs");
            int val=t1.val+t2.val+carry;
            
            System.out.println("carry is "+carry+" and val is "+val%10);
            
           
            if(final1==null)
            {
                Node nd=new Node(val%10);
                final1=nd;
                t3=final1;
                System.out.println(val%10 +" is added ");
            }
            else
            {
                Node nd=new Node(val%10);
                t3.next=nd;
                t3=nd;
                System.out.println(val%10 +" is added ");
            }
            if(val>9)
            {
                carry=val / 10;
                System.out.println("new carry is "+carry);
            }
                else
            carry=0;
            Node c1=t1;
            Node c2=t2;
            t1=t1.next;
            t2=t2.next;
            
            if(t1==null && t2==null)
            {
                break;
            }
            if(t1==null)
            {
                Node nd=new Node(0);
                c1.next=nd;
                c1=nd;
                t1=c1;
            }
            if(t2==null)
            {
                Node nd=new Node(0);
                c2.next=nd;
                c2=nd;
                t2=c2;
            }
            System.out.println("-----------------------");
            
        }
        if(carry!=0)
        {
            Node nd=new Node(carry);
            t3.next=nd;
        }
        return final1;
    }
    static void printlist(Node start)
    {
        Node t=start;
        while(t!=null)
        {
            System.out.print(t.val+"---->");
            t=t.next;
        }
        System.out.println("X");
        System.out.println();
    }
}
