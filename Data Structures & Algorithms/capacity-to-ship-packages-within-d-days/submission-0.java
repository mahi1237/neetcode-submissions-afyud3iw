class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        // it will find the range of the weight capacity
        for(int x: weights)
        {
            if(x>max)
            {
                max=x;
            }
            sum+=x;
        }
        // find the mid point of the weight capcity of the shpis in the range of 10 to 26
        int low=max;
        int high=sum;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            int d=1;
            int load=0;
            for(int x: weights)
            {
              if(load+x<=mid)
              {
                load+=x;
              }
              else
              {
                d++;
                load=x;
              }

            }
        
            if(d<=days)
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
            
        
    }
    return low;
}
}
