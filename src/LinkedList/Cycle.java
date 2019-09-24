package LinkedList;

public class Cycle {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode one = head, two = head.next.next;
        while(one != null && two.next != null){
            if(one == two)
                return true;
            one = one.next;
            two = two.next.next;
        }
        return false;
    }

}
