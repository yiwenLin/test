package zuochengyun;



public class test09 {
      public ListNode FindKthToTail(ListNode head, int k) {
    	  if(head==null) return head;
    	  ListNode node = head;
    	  int count = 0;
    	  while(node != null) {
    		  count++;
    		node = node.next;
    		  
    	  }
    	  if(count<k) return null;
    	  ListNode p =head;
    	  for (int i = 0; i < count-k; i++) {
			p = p.next;
		}
		return p;
    	  
      }
}
