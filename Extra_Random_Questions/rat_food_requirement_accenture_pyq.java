
package Extra_Random_Questions;
import java.util.*;
public class rat_food_requirement_accenture_pyq 
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter r");
        int r=scan.nextInt();
        System.out.println("enter unit");
        int unit = scan.nextInt();
        System.out.println("enter n ");
        int n=scan.nextInt();
        System.out.println("enter n elements of array separated by comma ");
        scan.nextLine();
        String s=scan.nextLine();
        int arr[]=new int[n];
        StringTokenizer st=new StringTokenizer(s,",");
        int tokens=st.countTokens();
        for(int i=0;i<tokens;i++)
        {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("answer is "+ mine(r,unit,arr));
        
    }
    public static int mine(int r , int unit , int[] arr)
    {
        int req = r*unit;
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            count++;
            if(sum >=req)
            return count;
        }
        return 0;
    }
}
