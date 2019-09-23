package LinkedList;

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode toRemove = head;
        ListNode last = head;
        if (head.next == null){
            head = null;
            return head;
        }
        for(int i = 0; i < n-1; i++)
            last = last.next;
        if(n == 1){
            while(toRemove.next.next != null)
                toRemove = toRemove.next;
            toRemove.next = null;
            return head;
        }
        while(last.next != null) {
            last = last.next;
            toRemove = toRemove.next;
        }

        // Remove the node
        while(toRemove.next != null ){
            toRemove.val = toRemove.next.val;
            if(toRemove.next.next == null) {
                toRemove.next = null;
                return head;
            }
            toRemove = toRemove.next;
        }
        return head;
    }
}
