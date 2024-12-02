class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = nums.length - 1;

                while (left <= right) {
                    int midIndex = left + (right - left) / 2;
                    int sum = nums[i] + nums[j] + nums[midIndex];

                    if (sum > 0) {
                        right = midIndex - 1;
                    } else if (sum < 0) {
                        left = midIndex + 1;
                    } else {
                        List<Integer> tempSet = new ArrayList<>();
                        tempSet.add(nums[i]);
                        tempSet.add(nums[j]);
                        tempSet.add(nums[midIndex]);
                        
                        result.add(tempSet);
                        break;
                    }
                }
            }
        }

        return result;
    }
}