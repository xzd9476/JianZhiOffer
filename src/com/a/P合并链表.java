package com.a;

public class PºÏ²¢Á´±í {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode Merge(ListNode list1, ListNode list2) {
		ListNode head=new ListNode(-1);
		ListNode root=head;
		while(list1 !=null && list2 !=null){
			if(list1.val>list2.val){
				head.next=list2;
				head=head.next;
				list2=list2.next;
			}else{
				head.next=list1;
				head=head.next;
				list1=list1.next;
			}
		}
		if(list1==null)
			head.next=list2;
		if(list2==null)
			head.next=list1;
		return root.next;
	}

}
