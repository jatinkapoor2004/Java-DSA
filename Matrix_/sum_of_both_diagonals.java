package Matrix_;
public class sum_of_both_diagonals 
{
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{4,5,6},{10,8,9}};
        print(a);
        System.out.println(sum(a));   
    }
    static int sum(int a[][])
    {
        int D1=0;
        int D2=0;
        for (int i=0;i<=a.length-1;i++)//we can do with single loop it take only three steps make relation of i and j accordingly
        {
            D1=D1+a[i][i];
            D2=D2+a[i][2-i];
        }
        return D2;// return d1 and d2 accordingly
    }
    static void print(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}




