package Matrix_Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class leetcode_1329_sort_matrix_diagonally 
{
    public static void main(String[] args) 
    {
        int a[][]={{11,25,66,1,69,7},{23,55,17,45,15,52},{75,31,36,44,58,8},{22,27,33,25,68,4},{84,28,14,11,5,50}};
        System.out.println("before sorting ");
        print(a);
        System.out.println("after sorting");
        print(diagonalSort(a));
    }
     public static int[][] diagonalSort(int[][] a)
     {
         int m=a.length;
         int n=a[0].length;
        for(int col=0;col<n;col++)
        {
            mine(a, 0, col);
        }
        for(int row=1;row<m;row++)
        {
            mine(a, row, 0);
        }
        return a;
     }
     
     public static void mine(int a[][],int row,int col)
     {
         int r=row,c=col;
         int m=a.length;
         int n=a[0].length;
         ArrayList<Integer> al=new ArrayList<>();
         while(r<m && c<n)
         {
             al.add(a[r][c]);
             r++;
             c++;
         }
         Collections.sort(al);
         // before putting back lets restore the values
         r=row;
         c=col;
         int k=0;
         while(r<m && c<n)
         {
             a[r][c]=al.get(k++);
             r++;
             c++;
         }
         
     }
     static void print(int a[][])
    {
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=0;j<=a[i].length-1;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
