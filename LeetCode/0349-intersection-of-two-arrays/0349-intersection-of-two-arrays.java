class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().toList();
        List<Integer> list2 = Arrays.stream(nums2).boxed().toList();

        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);

        set1.retainAll(set2);

        return set1.stream().mapToInt(i -> i).toArray();
    }
}