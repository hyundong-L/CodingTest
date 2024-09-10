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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        list = mergeSort(list, 0, list.size() - 1);

        ListNode answer = new ListNode(list.get(0));
        ListNode current = answer;

        for (int i = 1; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }

        return answer;
    }

    private List<Integer> mergeSort(List<Integer> listNode, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            listNode = mergeSort(listNode, p, q);
            listNode = mergeSort(listNode, q + 1, r);
            return merge(listNode, p, q, r);
        } else {
            return listNode;
        }
    }

    private List<Integer> merge(List<Integer> listNode, int p, int q, int r) {
        List<Integer> result = new ArrayList<>();
        int left = p, right = q + 1;

        while (left <= q && right <= r) {
            if (listNode.get(left) <= listNode.get(right)) {
                result.add(listNode.get(left));
                left++;
            } else {
                result.add(listNode.get(right));
                right++;
            }
        }

        while (left <= q) {
            result.add(listNode.get(left));
            left++;
        }
        while (right <= r) {
            result.add(listNode.get(right));
            right++;
        }

        for (int i = 0; i < result.size(); i++) {
            listNode.set(p + i, result.get(i));
        }

        return listNode;
    }
}