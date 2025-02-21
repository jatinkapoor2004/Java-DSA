
package Matrix_;
public class transpose_of_matrix_with_extra_array 
{
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("before transpose");
        print(a);
        
        System.out.println("after transpose");
        print(transpose(a));
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
    static int [][] transpose(int a[][])
    {
        int b[][]=new int[a.length][a.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        return b;
        
    }
}



