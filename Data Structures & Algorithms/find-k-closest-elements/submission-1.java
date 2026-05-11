class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i=0;
        int j=arr.length-1;
        while(j-i>=k)
        {
            if(Math.abs(arr[i]-x)<=Math.abs(arr[j]-x))
            {
              j--; // expand the window
            }
            else
            {
                i++;
            }
        }
           List<Integer> result = new ArrayList<>();
        for (int l = i; l <= j; l++) {
            result.add(arr[l]);
        }
        return result;
        
    }
}