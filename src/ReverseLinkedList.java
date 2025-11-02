import model.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(reverseList(head));
    }

    //1()=>2()=>3()=>4()=>5()=>null()
//    5() =5
    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        var temp = reverseList(head.next);
        if(temp == null) return head;
        head.next.next = head;
        head.next = null;
        return temp;
    }

}



