package Playing_with_number;
public class leetcode_461_hamming_distance 
{
    public static void main(String[] args)
    {
        System.out.println(hammingDistance(4, 1));
    }
    public static int hammingDistance(int x, int y) 
    {
        int max=Math.max(x, y);
        int min=Math.min(x, y);
        String s1=Integer.toBinaryString(max);
        String s2=Integer.toBinaryString(min);
        //System.out.println(max+" in binary "+s1);
        //System.out.println(min+" in binary "+s2);
        int diff=s1.length()-s2.length();
        for(int i=1;i<=diff;i++)
        {
            s2="0"+s2;
        }
        //System.out.println(max+" in binary "+s1);
        //System.out.println(min+" in binary "+s2);
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1!=ch2)
            {
                count++;
            }
        }
        
        return count;
    }
}
