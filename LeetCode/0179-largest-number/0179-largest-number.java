class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder result = new StringBuilder();

        mergeSort(nums, 0, nums.length - 1);

        for (int num : nums) {
            result.append(num);
        }

        // for {0, 0}, {0, 0, 0} ...
        if (result.charAt(0) == '0') {
            return "0";
        }

        return result.toString();
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
            int compareValue = customCompareTo(nums, left, right);

            if (compareValue > 0) {
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

    // a > b -> 1
    // a < b -> -1
    // a == b -> 0
    private int customCompareTo(int[] list, int a, int b) {
        String aCase = String.valueOf(list[a]) + String.valueOf(list[b]);
        String bCase = String.valueOf(list[b]) + String.valueOf(list[a]);

        if (aCase.length() == bCase.length()) {
            for (int i = 0; i < aCase.length(); i++) {
                if (aCase.charAt(i) == bCase.charAt(i)) {
                    continue;
                } else if (aCase.charAt(i) > bCase.charAt(i)) {
                    return 1;
                } else {
                    return -1;
                }
            }

            return 0;
        }

        return aCase.length() > bCase.length() ? 1 : -1;
    }
}