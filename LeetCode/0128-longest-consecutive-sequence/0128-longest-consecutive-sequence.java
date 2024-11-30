class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }

        List<Integer> list = new ArrayList<>(hashSet);
        list.sort(Integer::compareTo);

        int beforeResult = 0;
        int temp = 1;
        for (int i = 0; i <= list.size() - 2; i++) {
            if (list.get(i + 1) - list.get(i) == 1) {
                temp++;
            } else {
                beforeResult = Math.max(temp, beforeResult);
                temp = 1;
            }
        }
        beforeResult = Math.max(temp, beforeResult);

        return beforeResult;
    }
}