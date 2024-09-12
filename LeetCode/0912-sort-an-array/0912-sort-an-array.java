class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int[] mergeSort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            nums = mergeSort(nums, start, mid);
            nums = mergeSort(nums, mid + 1, end);

            return merge(nums, start, mid, end);
        } else {
            return nums;
        }
    }

    private int[] merge(int[] nums, int start, int mid, int end) {
        int left = start, right = mid + 1;
        int[] result = new int[end - start + 1];
        int index = 0;

        while (left <= mid && right <= end) {
            if (nums[left] <= nums[right]) {
                result[index++] = nums[left++];
            } else {
                result[index++] = nums[right++];
            }
        }

        while (left <= mid) {
            result[index++] = nums[left++];
        }
        while (right <= mid) {
            result[index++] = nums[right++];
        }

        for (int i = 0; i < index; i++) {
            nums[start + i] = result[i];
        }

        return nums;
    }
}