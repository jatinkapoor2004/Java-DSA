package Matrix_Leetcode;

import java.util.Arrays;

public class leetcode_2643_row_with_maximum_ones 
{
    public static void main(String[] args) 
    {
        int a[][]={{0,1},{1,0}};
        print(a);
        System.out.println(Arrays.toString(rowAndMaximumOnes(a)));
    }
    public static int[] rowAndMaximumOnes(int a[][]) 
    {
        int countones,rownumber=a.length-1,maxones=0;
        for(int i=a.length-1;i>=0;i--)
        {
            countones=0;
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]==1)
                {
                    countones++;
                }
            }
            //System.out.println("number of 1 in "+i+"th row is "+countones);
            if(countones>=maxones)
            {
                maxones=countones;
                rownumber=i;
            }
        }
        return new int[]{rownumber, maxones};

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
