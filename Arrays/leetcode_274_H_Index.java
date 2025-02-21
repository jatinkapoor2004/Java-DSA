package Arrays;
import java.util.*;
public class leetcode_274_H_Index 
{
    public static void main(String[] args) 
    {
        int a[]={3,0,6,1,5};
        System.out.println("Normal arrays is "+Arrays.toString(a));
        System.out.println(hIndex(a));
    }
    public static int hIndex(int[] a)
    {
        int n=a.length;
        int b[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(a[i]>n)
            {
                b[n]++;
            }
            else
            {
                b[a[i]]++;
            }
        }
        //System.out.println(Arrays.toString(b));
        
        int h_index=0;
        for(int i=n;i>=0;i--)
        {
            //System.out.println("loop runs");
            h_index = h_index+b[i];
            if(h_index>=i)
            {
                return i;
            }
           
                
            
        }
        return 0;
    }
    
    /*
    class Solution {
    public int hIndex(int[] cit) {
        Arrays.sort(cit); // Step 1: Sort the array in ascending order
        int n = cit.length; // Get the number of papers

        // Step 2: Iterate over the sorted citations
        for (int i = 0; i < n; i++) {
            int h = n - i; // Calculate h as the number of papers from i to the end
            if (cit[i] >= h) { // Check if the citation count at position i is >= h
                return h; // If true, return h as the H-Index
            }
        }
        
        return 0; // If no valid H-Index is found, return 0
    }
}
    */
}
