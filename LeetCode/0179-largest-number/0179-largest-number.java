class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder result = new StringBuilder();

        quickSort(nums, 0, nums.length - 1);

        for (int num : nums) {
            result.append(num);
        }

        // for {0, 0}, {0, 0, 0} ...
        if (result.charAt(0) == '0') {
            return "0";
        }

        return result.toString();
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = high;

        int i = low - 1;
        for (int j = low; j < pivot; j++) {
            int compareValue = customCompareTo(nums, j, pivot);

            if (compareValue > 0) {
                int temp = nums[++i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i + 1];
        nums[i + 1] = nums[pivot];
        nums[pivot] = temp;

        return i + 1;
    }

    private void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivot = partition(nums, low, high);

            quickSort(nums, low, pivot - 1);
            quickSort(nums, pivot + 1, high);
        }
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