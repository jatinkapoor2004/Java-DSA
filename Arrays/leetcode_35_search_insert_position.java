package Arrays;
public class leetcode_35_search_insert_position 
{
    public static void main(String[] args) 
    {
        int nums[]={1,3,5,6};
        int target=2;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target)
    {
        if(target<nums[0])
        {
            return 0;
        }
        if(target>nums[nums.length-1])
        {
            return nums.length;
        }
        //these all are indexes
        int beg=0,end=nums.length-1,mid=0;
        while(beg<=end)
        {
            mid=(beg+end)/2;
            System.out.println("mid index is "+mid);
            System.out.println("middle element is "+nums[mid]);
            if(nums[mid]==target)
            {
                System.out.println("mid is equal to target");
                return mid;
            }
            else if(nums[mid]>target)
            {
                System.out.println("end is changed to mid - 1");
                end=mid-1;
            }
            else
            {
                System.out.println("beg is changed to mid + 1");
                beg=mid+1;
            }
        }
        //returning beg because if while stop then it means beg is crossed the mid 
        //draw to understand 
        return beg;
    }
}
