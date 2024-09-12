class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int input : nums) {
            if (set.contains(input)) return input;
            else set.add(input);
        }

        throw new RuntimeException("중복 없음");
    }
}