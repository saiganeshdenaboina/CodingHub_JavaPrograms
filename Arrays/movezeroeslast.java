class Solution {
     void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                nums[k++]=nums[i];
            }
        }
      for(int i=k;i<nums.length;i++)
        {
                nums[k++]=0;
        }
        for(int temp:nums)
            System.out.println(temp);
        
    }
}
class Main 
{
    public static void main(String[] args)
    {
        int[] nums=new int[]{0,1,0,3,12};
        Solution s=new Solution();
        s.moveZeroes(nums);
    }
}