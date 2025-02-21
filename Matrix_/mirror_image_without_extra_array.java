package Matrix_;
public class mirror_image_without_extra_array 
{
    public static void main(String[] args) {
         int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("before mirror ");
        print(a);
        
        System.out.println("after mirror");
        print(mirror(a));
    }
    static int [][] mirror(int a[][])
    {
        int rows=a.length;
        int cols=a[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols/2;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[i][cols-1-j];
                a[i][cols-1-j]=temp;
            }
        }
        return a;
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
