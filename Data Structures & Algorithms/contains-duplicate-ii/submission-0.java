class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

    HashSet<Integer> hs = new HashSet<>(nums.length);
    for(int i=0;i<k;i++)
    {
        if(hs.contains(nums[i]))
        {
            return true;
        }
        hs.add(nums[i]);
    }
    // now we slide through the array
    for(int i=k;i<nums.length;i++)
    {
        
        if(hs.contains(nums[i]))
        {
            return true;
        }
        hs.add(nums[i]);
        hs.remove(nums[i-k]);
    }

       return false; 
    }
   
}
