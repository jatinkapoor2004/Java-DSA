package Linked_List;
public class leetcode_206_reverse_linked_list_3_pointers 
{
    public static void main(String[] args) {
        Linked_List_Functions ll=new Linked_List_Functions();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println("before reverse");
        printlist(ll.root);
        System.out.println("after reverse");
        printlist(reverseList(ll.root));
    }
    public static Node reverseList(Node head) 
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node t1=null;
        Node t2=head;
        
        while(t2!=null)
        {
            Node t3=t2.next;
            t2.next=t1;
            t1=t2;
            t2=t3;
        }
        head=t1;
        return head;
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
