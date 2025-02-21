package Matrix_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_1380_lucky_number_in_matrix 
{
    public static void main(String[] args) 
    {
        int a[][]={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(a));
    }
     public static List<Integer> luckyNumbers (int[][] a)
    {
        List<Integer>al=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            int mini=a[i][0];
            int store=0;
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]<mini)
                {
                    mini=a[i][j];
                    store=j;
                }
            }
            int maxi=a[i][store];
            for(int j=0;j<a.length;j++)
            {
                if(a[j][store]>maxi)
                {
                    maxi=a[j][store];
                }
            }
            if(mini==maxi)
            {
                al.add(maxi);
            }
        }
        return al;
    }
}
