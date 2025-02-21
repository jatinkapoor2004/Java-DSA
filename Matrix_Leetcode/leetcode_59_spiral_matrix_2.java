package Matrix_Leetcode;
public class leetcode_59_spiral_matrix_2 
{
    public static void main(String[] args) 
    {
        print(generateMatrix(10000));
    }
     public static int[][] generateMatrix(int n)
    {
        int a[][]=new int[n][n];
        int x1,x2,y1,y2;
        x1=0;y1=0;
        x2=n-1;y2=n-1;
        int k=1;
        int size=n*n;
        int i=0,j=0;
        while(k<=size)
        {
            //go right
            for(j=x1;j<=x2 && k<=size;j++)
            {
                a[i][j]=k++;
            }
            j--;
            y1++;
            
            //go down
            for(i=y1;i<=y2 && k<=size;i++)
            {
                a[i][j]=k++;
            }
            i--;
            x2--;
            
            //go left
            for(j=x2;j>=x1 && k<=size;j--)
            {
                a[i][j]=k++;
            }
            j++;
            y2--;
            
            //go up
            for(i=y2;i>=y1 && k<=size;i--)
            {
                a[i][j]=k++;
            }
            i++;
            x1++;
        }
        return a;
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
