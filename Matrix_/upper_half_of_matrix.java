package Matrix_;

public class upper_half_of_matrix 
{
    public static void main(String[] args) 
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        printmatrix(a);
        upper(a);
    }
    static void upper (int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(j>=i)
                {
                    System.out.print(a[i][j]+"\t");
                }
                else
                {
                    System.out.print(" "+"\t");

                }
            }
            System.out.println();
        }
        
    }
    
    static void printmatrix(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
