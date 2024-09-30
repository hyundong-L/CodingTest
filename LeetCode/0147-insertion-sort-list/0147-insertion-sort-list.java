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
    public void insert(ListNode sortedList, int data) {
        if (sortedList.next == null) {
            sortedList.next = new ListNode(data);
        } else {
            while (sortedList.next != null && sortedList.next.val <= data) {
                sortedList = sortedList.next;
            }
            ListNode newNode = new ListNode(data);
            newNode.next = sortedList.next;
            sortedList.next = newNode;
        }
    }

    public ListNode insertionSortList(ListNode head) {
        ListNode sortedList = new ListNode();

        while (head != null) {
            insert(sortedList, head.val);
            head = head.next;
        }

        return sortedList.next;
    }
}