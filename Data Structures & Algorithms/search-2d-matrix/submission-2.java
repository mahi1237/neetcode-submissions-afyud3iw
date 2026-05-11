class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS=matrix.length;
        int COLS=matrix[0].length;
        int low=0;
        int high=ROWS*COLS-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int row=mid/COLS;
            int col=mid%COLS;
            if(matrix[row][col]==target)
            {
                return true;
            }
            else if(matrix[row][col]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return false;
    }
}
