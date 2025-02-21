package Linked_List;
public class Testing 
{
    public static void main(String[] args) 
    {
        
        Linked_List_Functions ll=new Linked_List_Functions();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.print(ll.root);
        System.out.println();
        //System.out.println(ll.find(ll.root, 30));
        //System.out.println("size of LL is "+ll.size(ll.root));
        //System.out.println("Element at index "+ 2+ " is "+ ll.getElementAt(2));
        ll.addFirst(5);
        //ll.print(ll.root);
        
        ll.update(5, 3);
        ll.print(ll.root);
        System.out.println();
        ll.delete(1);
        ll.print(ll.root);
    }
}
