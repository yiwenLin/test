package leetcode;

public class test24 {
   public ListNode swapParis(ListNode head) {
	   if((head == null)||(head.next==null))
		   return head;
	   ListNode n = head.next;
       head.next = swapParis(head.next.next);
       n.next = head;
       return n;
}
}
