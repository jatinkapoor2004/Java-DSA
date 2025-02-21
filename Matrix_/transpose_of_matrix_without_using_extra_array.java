package Matrix_;

public class transpose_of_matrix_without_using_extra_array 
{
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("before transpose ");
        print(a);
        transpose(a);
        System.out.println("after transpose");
        print(a);
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
    static void transpose(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i<j)
                {
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }
    }
}
