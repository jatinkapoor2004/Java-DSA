package Recursion;
public class no_of_nodes_in_recursion_tree 
{
    public static void main(String[] args) {
        int count[]={0};
        fun(2, count);
        System.out.println(count[0]);
    }
    static void fun(int n,int count[])
    {
        if(n==0)
        {
            System.out.println(0);
            count[0]++;
        }
        else
        {
            count[0]++;
            System.out.println(n);
            fun(n-1, count);
            fun(n-1, count);
        }
    }
}
