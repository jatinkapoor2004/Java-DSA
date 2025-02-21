package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack_gfg 
{
    public static void main(String[] args) 
    {
        int W=50;
        Item al[]=new Item[3];
        //ArrayList<Item> al=new ArrayList<>();
        al[0]=new Item(60, 10);
        al[1]=new Item(100, 20);
        al[2]=new Item(120, 30);
//        System.out.println(Arrays.toString(al));
//        Arrays.sort(al,new mycomparator());
//         System.out.println(Arrays.toString(al));
        System.out.println(fractionalKnapsack(W, al, W));
    }
    static double fractionalKnapsack(int w, Item al[], int n) 
    {
        // Your code here
        //System.out.println("initial weight is "+w);
        double profit=0;
        Arrays.sort(al,new mycomparator());
        for(int i=0;i<n;i++)
        {
            Item item=al[i];
            //System.out.println(item.value);
            //System.out.println(item.weight);
            if(w - item.weight>=0)
            {
                profit += item.value;
                w = w- item.weight;
            }
            else
            {
                //System.out.println("else works");
                double fraction= (double)w/item.weight;
                //System.out.println("fraction is "+fraction);
                profit += (double) fraction * item.value;
                //System.out.println("new profit added is "+(int) fraction * item.value);
                //w =  w- (int)(fraction* item.weight);
                break;
            }
            //System.out.println("weight left is "+w);
        }
        return profit;
    }
    
}
class mycomparator implements Comparator<Item>
{

    @Override
    public int compare(Item o1, Item o2) 
    {
        double ratio1= (double)o1.weight/o1.value;
        double ratio2= (double)o2.weight/o2.value;
        
        if(ratio1 > ratio2)
        {
            return 1;
        }
        else if(ratio1 < ratio2)
        {
            return -1;
        }
        else 
            return 0;
    }
    
}
class Item
    {
        int value, weight;
        Item(int value, int weight)
        {
            this.value = value;
            this.weight = weight;
        }

    @Override
    public String toString() 
    {
        return value+" "+weight;
    }
        
    }
