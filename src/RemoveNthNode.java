//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import model.ListNode;

public class RemoveNthNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println(head);
//        System.out.println(removeNthFromEnd(head, 1));
        head.next.next = null;
        System.out.println(removeNthFromEnd(head, 1));
        System.out.println(removeNthFromEnd(head, 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 0) return head;
        if (n == 1 && head.next == null) return null;
        ListNode previous = new ListNode(0,head), nthNode = previous, lastNode = previous;
        while (n > 1) {
            lastNode = lastNode.next;
            n--;
        }
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            previous = nthNode;
            nthNode = nthNode.next;
        }


        return previous.next;
    }
}
