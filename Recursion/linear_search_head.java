package Recursion;
public class linear_search_head 
{
    public static void main(String[] args) {
        int a[]={5,19,4,61,6456,1,15};
        System.out.println(search(a,15,0));
    }
    static int search(int a[],int num,int i)
    {
        if(i==a.length)
            return -1;
        else if(a[i]==num)
            return i;
        else
            return search(a,num,++i);
    }
}
