package Linked_List;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leetcode_143_Reorder_List 
{
    public static void main(String[] args) {
        Linked_List_Functions ll=new Linked_List_Functions();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println("before reordering ");
        printlist(ll.root);
        System.out.println("after reordering ");
        System.out.println();
        reorderList(ll.root);
        printlist(ll.root);
       
    }
    public static void reorderList(Node head) 
    {
        Deque<Integer> dq=new ArrayDeque<>();
        Node t=head;
        while(t!=null)
        {
            dq.addLast(t.val);
            t=t.next;
        }
        
        Node final1=null;
        t=final1;
        int i=1;
        while(!dq.isEmpty())
        {
            //System.out.println("loop runs");
            Node nd;
            if(i%2!=0)
            {
                //System.out.println(dq.getFirst());
                nd=new Node(dq.removeFirst());
            }
            else
            {
                //System.out.println(dq.getLast());
                nd=new Node(dq.removeLast());
            }
            i++;
            if(final1==null)
            {
                final1=nd;
                t=nd;
            }
            else
            {
                t.next=nd;
                t=t.next;
            }
        }
        
        t=final1;
        Node t1=head;
        while(t!=null)
        {
            t1.val=t.val;
            t=t.next;
            t1=t1.next;
        }
    }
//    static int size(Node head)
//    {
//        int size=0;
//        Node t=head;
//        while(t!=null)
//        {
//            size++;
//            t=t.next;
//        }
//        return size;
//    }
//    static Node reverse(Node head)
//    {
//        Node final1=null;
//        Node t=head;
//        while(t!=null)
//        {
//            Node nd=new Node(t.val);
//            if(final1==null)
//            {
//                final1=nd;
//            }
//            else
//            {
//                nd.next=final1;
//                final1=nd;
//            }
//            t=t.next;
//        }
//        return final1;
//    }
    
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
