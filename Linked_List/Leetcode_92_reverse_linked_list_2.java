package Linked_List;
public class Leetcode_92_reverse_linked_list_2 
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
        printlist(reverseBetween(ll.root,2,4));
    }
    public static Node reverseBetween(Node head, int left, int right) 
    {
        Node dummy=new Node(69);
        dummy.next=head;
        Node current=head;
        Node prenode_se_phele_wali=dummy;
        for(int i=0;i<left-1;i++)
        {
            current=current.next;
            prenode_se_phele_wali=prenode_se_phele_wali.next;
        }
        Node previous=null;
        Node subListHead=current;
        for(int i=1;i<=right-left+1;i++)
        {
            Node next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        prenode_se_phele_wali.next=previous;
        subListHead.next=current;
        return dummy.next;
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
