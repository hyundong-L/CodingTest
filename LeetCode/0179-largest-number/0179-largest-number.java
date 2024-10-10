class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                customSort(nums, i, j);
            }
        }

        for (int num : nums) {
            result.append(num);
        }

        // for {0, 0}, {0, 0, 0} ...
        if (result.charAt(0) == '0') {
            return "0";
        }

        return result.toString();
    }

    //커스텀 정렬 메서드 -> 매개변수를 문자열로 더했을 때 더 큰 수가 나오도록 정렬
    //compareTo() 사용
    private void customSort(int[] list, int a, int b) {
        String aCase = String.valueOf(list[a]) + String.valueOf(list[b]);
        String bCase = String.valueOf(list[b]) + String.valueOf(list[a]);

        if (aCase.compareTo(bCase) < 0) {
            int temp = list[a];
            list[a] = list[b];
            list[b] = temp;
        }
    }
}