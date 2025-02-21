package Arrays;


import java.util.Arrays;

public class leetcode_724_find_pivot_index 
{
    public static void main(String[] args) 
    {
        int a[]={-1,-1,1,1,0,0};
        System.out.println(Arrays.toString(a));
        System.out.println("pivot is " +pivotIndex(a));
    }
    
    public static int pivotIndex(int[] a) 
    {
        int sum=0;
        for(int p:a)        
            sum=sum+p;  
        
//        if(sum==a[0])
//            return 0;
//        
//        if(sum==a[a.length-1])
//            return a.length-1;
// till now we cover base case of edge indexes 
// no need of this base cases
        int left=0;
        
        for(int i=0;i<a.length;i++)
        {
            int right = sum-left-a[i];
            System.out.println(right);
            if(left==right)
            {
                return i;
            }
            left=left+a[i];
            System.out.println(left);
            
       }
       return -1;
    }
}
