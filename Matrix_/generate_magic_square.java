package Matrix_;
public class generate_magic_square 
{
    public static void main(String[] args) 
    {
        print(generate(5));
    }
    static int [][] generate(int n)
    {
        
        int rows=n,cols=n;
        int a[][]=new int[rows][cols];
        int i=0,j=n/2;
        for(int k=1;k<=rows*cols;k++)
        {
            a[i][j]=k;
            int orig_i=i;
            int orig_j=j;
            i=i-1;
            j=j+1;

            //we go above the matrix
            if(i<0)
            {
                i=n-1;
            }
            if(j==n)
            {
                j=0;
            }
            if(a[i][j]!=0)
            {
                i=orig_i+1;
                j=orig_j;
            }
            //System.out.println(k+"is added !!");
            //print(a);
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
