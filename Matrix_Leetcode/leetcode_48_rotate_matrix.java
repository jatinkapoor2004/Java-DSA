package Matrix_Leetcode;
public class leetcode_48_rotate_matrix 
{
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("origial");
        print(a);
        
        rotate(a);
        System.out.println("Rotated ");
        print(a);
    }
    public static void rotate(int[][] a) 
    {
        transpose(a);
        mirror(a);
    }
    static void transpose(int [][] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i<j)//upper half only
                {
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }
    }
    static void mirror(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length/2;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[i][a[0].length-1-j];
                a[i][a[0].length-1-j]=temp;
            }
        }
    }
     static void print(int a[][])
    {
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=0;j<=a[i].length-1;j++)
            {
                System.out.print(a[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
