package Matrix_;

import static Matrix_.Submatrix_in_a_matrix.print;
import java.util.Arrays;
public class sort_matrix 
{
     public static void main(String[] args) {
        int a[][]={{12,11,10,9},{8,7,6,5},{4,3,5,1},{100,0,-8,-45}};
        System.out.println("before sort ");
        print(a);
        
        System.out.println("after sort");
        sortmatrix(a);
         print(a);
    }
     static void sortmatrix(int a[][])
     {
         int b[]=new int[a.length*a[0].length];
         int k=0;
         for(int i=0;i<a.length;i++)
         {
             for(int j=0;j<a[0].length;j++)
             {
                 b[k++]=a[i][j];
             }
         }
         Arrays.sort(b);
         System.out.println(Arrays.toString(b));
         k=0;
         for(int i=0;i<a.length;i++)
         {
             for(int j=0;j<a[0].length;j++)
             {
                 a[i][j]=b[k++];
             }
         }
     }
}
