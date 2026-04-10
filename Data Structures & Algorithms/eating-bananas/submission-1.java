class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int n=piles.length;
    int low=1;
    int high=Arrays.stream(piles).max().getAsInt();
    int ans=high;
    while(low<=high)
    {
        int mid=low+(high-low)/2;
         long total = 0;
            for (int x : piles) {
                total += (x + mid - 1) / mid;
            }
        if(total<=h)
        {
            ans=Math.min(ans,mid);
            high=mid-1;
        }
        else if (total>h)
        {
            low=mid+1;
        }
    }
    return ans;
    }
}
