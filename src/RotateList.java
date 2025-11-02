import model.ListNode;

public class RotateList {
    public static void main(String[] args) {
        var list = ListNode.defaultList();
        list.next.next.next.next = null;
        System.out.println(new Solution().rotateRight(list, 210));
        list.next = null;
        System.out.println(new Solution().rotateRight(list, 1));
    }

    static /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
//    1=2=3=4=5
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (k == 0 || head == null) return head;
            if (head.next == null) return head;
            var temp = head;
            int count = 0;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            System.out.println(k % count);
            return rotate(head, k % count);
        }

        private static ListNode rotate(ListNode head, int k) {
            ListNode lastNode = null;
            for (int i = 0; i < k; i++) {
                var root = head;
                while (head.next != null) {
                    lastNode = head;
                    head = head.next;
                }
                lastNode.next = null;
                head.next = root;
            }
            return head;
        }

    }
}
