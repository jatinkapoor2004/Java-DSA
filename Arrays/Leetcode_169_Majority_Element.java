package Arrays;
import java.util.*;
public class Leetcode_169_Majority_Element 
{
    public static void main(String[] args)
    {
        int a[]={1};
        System.out.println(majorityElement(a));
    }
    public static int majorityElement(int[] a)
    {
        /*int len=a.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<len;i++)
        {
            if(hm.containsKey(a[i]))
            {
                System.out.println("key already exist");
                System.out.println("Old value is "+ hm.get(a[i]));
                int val=hm.get(a[i]);
                val++;
                hm.put(a[i], val);
                System.out.println("new val is added succesfulluy"+ hm.get(a[i]));
            }
            else
            {
                System.out.println("doent exist added new "+ a[i]);
                hm.put(a[i], 1);
            }
        }
        System.out.println(hm);
        if(hm.size()==1)
        {
            return a[0];
        }
        int max[]=new int[2];
        int ma=1;
        for(int p:hm.keySet())
        {
            
            max[1]=hm.get(p);
            if(max[1]>ma)
            {
                ma=max[1];
                max[0]=p;               
            }
            //System.out.println("loop");
            
            // second method
            
            if(hm.get(p)>a.length/2)
                return p;
        }
        return max[0];*/
        int maj=a[0],votes=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==maj)
            {
                votes++;
            }
            else if(a[i]!=maj)
            {
                votes--;
                if(votes==0)
                {
                maj=a[i];
                votes++;
                }
            }
            else
            {
                votes--;
            }
            
        }    
        return maj; 
    }   
}
