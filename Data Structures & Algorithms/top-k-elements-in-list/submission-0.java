class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         int n=nums.length;
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);

        }
        // convert the map into the list
        //List<hs.Entry<Integer,Integer>> list=new ArrayList<>(hs.keySet())
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hs.entrySet());
        Collections.sort(entryList,(a,b)->b.getValue()-a.getValue());
        int []result=new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=entryList.get(i).getKey();
        }
return result;
    }
        
    }

