package Arrays;
import java.util.*;
public class leetcode_498_Diagonal_Traverse 
{
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        printmatrix(a);
        System.out.println(Arrays.toString(findDiagonalOrder(a)));
    }
    
    public static int[] findDiagonalOrder(int[][] a)
    {
        int rows=a.length;
        int cols=a[0].length;

        int ans[]=new int[rows*cols];
        
        HashMap< Integer , ArrayList<Integer> > hm=new HashMap<>();
        for(int i=0 ; i<rows ; i++)
        {
            for(int j=0 ; j<cols ; j++)
            {
                if(!hm.containsKey(i+j))
                {                                   
                    hm.put( i+j , new ArrayList<>());
                }
                hm.get(i+j).add(a[i][j]);
            }
        }
        //System.out.println(hm);
        int index=0;
        for(int p : hm.keySet())
        {
            ArrayList<Integer> al=hm.get(p);
            if(p%2==0)
            {
                Collections.reverse(al);
            }
            for(int k : al)
            {
                ans[index++] = k;
            }
        }
        
        return ans;
    }
    static void printmatrix(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
