package Matrix_;

import static Matrix_.Submatrix_in_a_matrix.print;

public class set_boundary_zero 
{
    public static void main(String[] args)
    {
        int a[][]={{12,11,10,9},{8,7,6,5},{4,3,5,1},{100,0,-8,-45}};
        System.out.println("before zeros ");
        print(a);
        
        System.out.println("after zeros");
        setzero(a);
         print(a);
    }
    static void setzero(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i==0 || i==a.length-1 || j==0 ||j==a[i].length-1)
                {
                    a[i][j]=1;
                }
                else
                {
                    a[i][j]=0;
                }
            }
        }
    }
}
