package LinkedList;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        // Length = 1
        if(head == null || head.next == null)
            return head;
        // Length = 2
        if(head.next.next == null){
            int val = head.val;
            head.val = head.next.val;
            head.next.val = val;
            return head;
        }
        // Length > 2
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = head.next.next;
        a.next = null;
        while(c != null){
            b.next = a;
            a = b;
            b = c;
            c = c.next;
        }
        b.next = a;
        return b;
    }
}
