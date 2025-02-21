package Matrix_;
public class Submatrix_in_a_matrix 
{
    public static void main(String[] args) {
        int a[][]={{1,2,3,1},{4,5,6,1},{7,8,9,1},{7,8,9,1}};
        System.out.println("before submatrix ");
        print(a);
        
        System.out.println("after submatrix");
        print(submatrix(a));
    }
    static int[][] submatrix(int a[][])
    {
        int b[][]=new int [a.length-2][a[0].length-2];
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                b[i][j]=a[i+1][j+1];
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
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
