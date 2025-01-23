class Solution {
    public String solution(String phone_number) {
        String phoneLastFourNumber = phone_number.substring(phone_number.length() - 4);
        int phoneElseNumberLength = phone_number.length() - 4;

        return "*".repeat(Math.max(0, phoneElseNumberLength)) + phoneLastFourNumber;
    }
}