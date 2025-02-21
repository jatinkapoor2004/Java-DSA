package Matrix_Leetcode;
public class leetcode_463_Island_Perimeter 
{
    public static void main(String[] args) {
        int a[][]={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(a));
    }
    public static int islandPerimeter(int[][] a)  
    {
        int peri=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
               if(a[i][j]==1)
               {
                   peri+=4;
                   if( i>0 && a[i-1][j]==1)
                   {
                       peri-=2;
                   }
                   if(j>0 && a[i][j-1]==1)
                   {
                       peri-=2;
                   }
               }
                
            }
        }
        return peri;
    }
}
