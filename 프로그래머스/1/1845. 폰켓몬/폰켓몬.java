import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int canGet = nums.length / 2;

        HashSet<Integer> setNums = new HashSet<>();

        for (int num : nums) {
            if (setNums.size() < canGet) {
                setNums.add(num);
            } else break;
        }

        return setNums.size();
    }
}