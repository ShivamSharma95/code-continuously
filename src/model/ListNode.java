package model;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (ListNode current = this; current != null; current = current.next) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(" -> ");
            }
        }

        return sb.toString();
    }

    public static ListNode defaultList() {
        return new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    }
}
