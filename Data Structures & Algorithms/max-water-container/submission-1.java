class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int i=0;
        int j=n-1;
        int max=0;
    
        while(i<j)
        {
            int hight=Math.min(heights[i],heights[j]);
            int width=j-i;
            int area= hight*width;
            max=Math.max(area,max);
            if(heights[i]<heights[j])
            {
                i++;
            }
            else
            {
                j--;
            }


        }
return max;

    }

}
