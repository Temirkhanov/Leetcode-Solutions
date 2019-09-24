package LinkedList;

public class Palindrome {

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        if(head.next.next == null)
            return head.next.val == head.val;
        int count = 1;
        ListNode n = head;
        while(n.next != null){
            count++;
            n = n.next;
        }
        if(count == 3)
            return head.val == head.next.next.val;
        else {
            count /= 2;
            ListNode iter = head;
            for(int i = 0; i < count; i++)
                iter = iter.next;
            iter = ReverseLinkedList.reverseList(iter);
            n = head;
            for(int i = 0; i < count; i++) {
                if (iter.val != n.val)
                    return false;
                n = n.next;
                iter = iter.next;
            }
        }
        return true;
    }


}
