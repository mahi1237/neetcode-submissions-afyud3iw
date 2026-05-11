class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int sum=0;
        int j=0;
        int mincount=Integer.MAX_VALUE;
      for( j=0;j<nums.length;j++)
      {
            sum+=nums[j];
      while(sum>=target)
      {
        int count=j-i+1;
        mincount=Math.min(mincount,count);
        sum-=nums[i];
        i++;
      }
      }
    if (mincount == Integer.MAX_VALUE) {
    return 0;
}
return mincount;
        
    }
}