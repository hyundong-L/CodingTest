/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();

        ListNode forList = head;

        while (forList != null) {
            list.add(forList.val);
            forList = forList.next;
        }

        int first = 1;
        int last = list.size() - 1;

        while (first < last) {
            int temp = list.get(first);
            list.set(first, list.get(last));
            list.set(last, temp);

            first++;
            last--;
        }

        System.out.println(list);

        int index = 0;
        while (head != null) {
            head.val = list.get(index++);
            head = head.next;
        }
    }
}