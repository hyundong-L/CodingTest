class Solution {
    public int reverse(int x) {
        //음수일 때 처리 필요
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }

        String str = String.valueOf(x);
        char[] chars = str.toCharArray();

        StringBuilder reverse = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
            reverse.append(chars[i]);
        }

        long checkSize = Long.parseLong(reverse.toString());
        if (checkSize > Integer.MAX_VALUE || checkSize < Integer.MIN_VALUE) return 0;

        int result = Integer.parseInt(reverse.toString());
        if (isNegative) result = -result;
        
        return result;
    }
}