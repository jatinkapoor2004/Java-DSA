package Arrays;
public class leetcode_3079_find_the_sum_of_encrypted_digits 
{
    public static void main(String[] args) {
        int nums[]={10,21,31};
        System.out.println(sumOfEncryptedInt(nums));
      //System.out.println(check_encrypt(10));
    }
    public static int sumOfEncryptedInt(int[] a) 
    {
      int sum=0;
      for(int i=0;i<a.length;i++)
      {
          sum += check_encrypt(a[i]);
      }
      return sum;
    }
    static int check_encrypt(int n)
    {
        
        int length=0;
        int max= -1;
        while(n!=0)
        {
            int digit=n%10;
            max=Math.max(max, digit);
            length++;
            n=n/10;
        }
        int enc=0;
        for(int i=1;i<=length;i++)
        {
            enc=enc*10 + max;
        }
        return enc;
    }
}
