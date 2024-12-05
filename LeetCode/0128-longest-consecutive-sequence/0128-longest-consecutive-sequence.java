class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }

        int beforeResult = 0;
        for (int num : hashSet) {
            if (!hashSet.contains(num - 1)) {
                int len = 1;
                int nextNum = num + 1;
                while (hashSet.contains(nextNum)) {
                    nextNum++;
                    len++;
                }
                
                beforeResult = Math.max(beforeResult, len);
            }
        }

        return beforeResult;
    }
}