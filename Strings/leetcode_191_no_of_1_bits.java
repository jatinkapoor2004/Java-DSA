package Strings;
public class leetcode_191_no_of_1_bits 
{
    public static void main(String[] args) 
    {
        System.out.println(hammingWeight(2147483645));
    }
    public static int hammingWeight(int n) 
    {
        //without using inbuilt function
        int count=0;
        while(n!=0)
        {
            int rem=n%2;
            if(rem==1)
                count++;
            n=n/2;
        }
        return count;
    }
       
}
//        String s= Integer.toBinaryString(n);
//        int count=0;
//       for(int i=0;i<s.length();i++)
//       {
//           if(s.charAt(i)=='1')
//           {
//               count++;
//           }
//       }
//       return count;

