class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hs=new HashMap<>(n);
        for(int i=0;i<n;i++)
        {

                hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer>arr=new ArrayList<>();
        int index=0;
        for(Integer key: hs.keySet())
        {
            if(hs.get(key) > n/3)
            {
                arr.add(key);
            }

        }
        return arr;

    }
}

        


