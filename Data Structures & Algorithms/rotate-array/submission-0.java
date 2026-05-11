class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int j = n - 1;

        for (int i = 0; i < k; i++) {

            int temp = nums[0];
            nums[0] = nums[j];
            nums[j] = temp;

            int x = 1;
            int l = n - 1;

            while (x < n) {
                temp = nums[x];
                nums[x] = nums[l];
                nums[l] = temp;
                x++;
            }
        }
    }
}