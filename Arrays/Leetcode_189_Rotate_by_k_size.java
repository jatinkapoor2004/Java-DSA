package Arrays;
//***************IMPORTANT*************
// Always take modulus of k bcoz k may be greater than size of array
// If k=8 then 8%7=1 that give only 1 rotation 
import java.util.Arrays;
import java.util.Collections;

public class Leetcode_189_Rotate_by_k_size 
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=3;
        System.out.println(Arrays.toString(a));
        rotate4(a,k);
        System.out.println(Arrays.toString(a));
    }
    // this approach doesn't work on all arrays specially when size is small
    // problem can be solved with modulus
    static void rotate (int a[],int k)
    {
        k=k%a.length;
        int b[]=new int[k];
        for(int i=0;i<k;i++)
        {
             b[i]=a[a.length-k+i];
        }
        System.out.println(Arrays.toString(b));
        for(int j=a.length-k-1;j>=0;j--)
        {
                a[j+k]=a[j];
        }
        System.out.println(Arrays.toString(a));

        for(int i=0;i<k;i++)
        {
            a[i]=b[i];
        }
    }    
    // this is a good approach but TIME LIMIT EXCEEDS
    static void rotate2(int a[],int k)
    {
        k=k%a.length;
        for(int i=1;i<=k;i++)
        {
            int temp=a[a.length-1];
            for(int j=1;j<a.length;j++)
            {
                a[a.length-j]=a[a.length-1-j];
            }
            a[0]=temp;
        }
    }
    
    //this method also didn't work on all arrays can be solved with modulus
    // This is the best approach so far
    static void rotate3(int a[],int k)
    {
        k=k%a.length;
       int b[]=new int[a.length];
       for(int i=0;i<k;i++)
       {
           b[i]=a[a.length+i-k];           
       }
       for(int i=k;i<a.length;i++)
       {
           b[i]=a[i-k];
       }
       for(int i=0;i<a.length;i++)
           a[i]=b[i];
    }
    // YT approach i.e rotate full then rotate other two halves from K
    static void rotate4(int a[],int k)
    {
        int size=a.length;
        k=k%size;
       for(int i=0;i<=(size/2)-1;i++)
       {
           int temp=a[i];
           a[i]=a[size-i-1];
           a[size-i-1]=temp;
       }
 
        for(int i=0;i<=(k/2)-1;i++)
        {
            int temp=a[i];
            a[i]=a[k-i-1];
            a[k-i-1]=temp;            
        }      
        for(int i=0;i<=((size-k)/2)-1;i++)
        {
            int temp=a[i+k];
            a[i+k]=a[size-i-1];
            a[size-i-1]=temp;            
        }
       
    }
}
