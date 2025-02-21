package Matrix_Leetcode;
public class leetcode_733_flood_fill_Recursion_DP_Batch 
{
    public static void main(String[] args) {
        //int a[][]={{1,1,1},{1,1,0},{1,0,1}};
        int b[][]={{0,0,0},{1,0,0}};
        printmatrix(b);
        System.out.println("-----------------");
        printmatrix(floodFill(b, 1, 0, 2));
    }
    /* this is my original code 
    
     public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int start_color=image[sr][sc];
        mine(image, image.length-1, image[0].length-1, sr, sc, color,start_color);
        return image;
    }
    public static void mine(int a[][],int r,int c,int i,int j,int color,int start_color)
    {
        if(a[i][j]!=start_color || a[i][j]==color)
        {
            //do nothing 
        }
        else
        {
            //go up
            if(i-1>=0)
            {
                a[i][j]=color;
                mine(a, r, c, i-1, j, color,start_color);
            }
            //go down
            if(i+1<=r)
            {
                a[i][j]=color;
                mine(a, r, c, i+1, j, color,start_color);
            }
            //go left
            if(j+1<=c)
            {
                a[i][j]=color;
                mine(a, r, c, i, j+1, color,start_color);
            }
            //go right
            if(j-1>=0)
            {
                a[i][j]=color;
                mine(a, r, c, i, j-1, color,start_color);
            }
        }
    }
    */
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int start_color=image[sr][sc];
        mine(image, image.length-1, (image[0].length)-1, sr, sc, color,start_color);
        return image;
    }
    public static void mine(int a[][],int r,int c,int i,int j,int color,int start_color)
    {
        if( a[i][j]==color )
        {
            //do nothing 
        }
        else
        {
            if(a[i][j]==start_color)
            {
                a[i][j]=color;
            
                //go up
                if(i-1>=0 )
                {
                    mine(a, r, c, i-1, j, color,start_color);
                }
                //go down
                if(i+1<=r )
                {
                    mine(a, r, c, i+1, j, color,start_color);
                }
                //go right
                if(j+1<=c )
                {
                    mine(a, r, c, i, j+1, color,start_color);
                }
                //go left
                if(j-1>=0 )
                {
                    mine(a, r, c, i, j-1, color,start_color);
                }
            }    
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
