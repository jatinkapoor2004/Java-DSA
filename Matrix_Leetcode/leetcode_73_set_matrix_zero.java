package Matrix_Leetcode;

import java.util.Arrays;

public class leetcode_73_set_matrix_zero 
{
    public static void main(String[] args) 
    {
        int a[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        System.out.println("before zeros ");
        print(a);
        setZeroes(a);
        System.out.println("after zeros");
        print(a);
    }
    public static void setZeroes(int[][] a) 
    {
        int rows=a.length;//3
        int cols=a[0].length;//4
        boolean a1[]=new boolean[rows];
        boolean a2[]=new boolean[cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(a[i][j]==0)
                {
                    a1[i]=true;
                    a2[j]=true;
                }
            }
        }
        //System.out.println(Arrays.toString(a1));
        //System.out.println(Arrays.toString(a2));
        
        for(int k=0;k<a1.length;k++)
        {
            if(a1[k]==true)
            {
                for(int l=0;l<cols;l++)
                {
                    a[k][l]=0;
                }
            }
        }
        //print(a);
        
        for(int k=0;k<a2.length;k++)
        {
            if(a2[k]==true)
            {
                for(int l=0;l<rows;l++)
                {
                    a[l][k]=0;
                }
            }
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
