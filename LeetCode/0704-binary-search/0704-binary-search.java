class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int start, int end) {
        int midIndex = (start + end) / 2;

        if (nums[midIndex] == target) {
            return midIndex;
        } else if (start == end || start > end) {
            return -1;
        } else if (nums[midIndex] > target) {
            return binarySearch(nums, target, 0, midIndex - 1);
        } else {
            return binarySearch(nums, target, midIndex + 1, end);
        }
    }
}