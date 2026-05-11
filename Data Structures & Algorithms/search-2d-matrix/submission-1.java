class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        List <Integer> result=new ArrayList<>();
        for(int[] row :matrix)
        {
            for(int num : row)
            {
                result.add(num);
            }
        }
        int low=0; int high=result.size()-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(result.get(mid)==target)
            {
                return true;
            }
            else
            {
                if(result.get(mid)>target)
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
        }
        return false;
    }
}
