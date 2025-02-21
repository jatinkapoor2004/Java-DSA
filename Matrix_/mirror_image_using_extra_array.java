
package Matrix_;

public class mirror_image_using_extra_array
{
    public static void main(String[] args) {
        int a[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        System.out.println("origial");
        print(a);
        
        int b[][]=mirror(a);
        System.out.println("mirror");
        print(b);
    }
    
    static int [][] mirror(int a[][])
    {
        int m=a.length,n=a[0].length;
        int b[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=a[i][n-j-1];
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
