class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        int maxLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > dp[maxLength - 1]) {
                dp[maxLength] = nums[i];
                maxLength++;
            } else {
                lowerBound(dp, nums[i], 0, maxLength - 1);
            }
        }

        return maxLength;
    }

    public void lowerBound(int[] nums, int n, int start, int end) {
        int mid;

        while (start < end) {
            mid = (start + end) / 2;
            
            if (nums[mid] < n) start = mid + 1;
            else end = mid;
        }

        nums[end] = n;
    }
}