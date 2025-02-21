package Matrix_Leetcode;
public class leetcode_867_Transpose_Matrix 
{
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("before transpose ");
        print(a);
        
        System.out.println("after transpose");
        print(transpose(a));
    }
    public static int[][] transpose(int[][] a) 
    {
        int rows=a.length;//2
        int cols=a[0].length;//3
        int b[][]=new int[cols][rows];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                b[j][i]=a[i][j];
            }
        }
        return b;
    }
    static void print(int a[][])
    {
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=0;j<=a[i].length-1;j++)
            {
                System.out.print(a[i][j]+"");
            }
            System.out.println();
        }
    }
}
