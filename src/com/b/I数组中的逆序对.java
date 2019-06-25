package com.b;

public class I数组中的逆序对 {
	/*
	 * 输入两个链表，找出它们的第一个公共结点。
	 */
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}
	
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 int len1=findLen(pHead1);
		 int len2=findLen(pHead2);
		 int cha=len1-len2;
		 if(cha>=0){
			 while(cha-->0)
				 pHead1=pHead1.next;
		 }else{
			 cha=cha*(-1);
			 while(cha-->0)
				 pHead2=pHead2.next;
		 }
		 while(pHead1!=null && pHead2!=null){
			 if(pHead1.val==pHead2.val)
				 return pHead1;
			 pHead1=pHead1.next;
			 pHead2=pHead2.next;
		 }
		 return null;
    }

	private int findLen(ListNode pHead) {
		int len=0;
		while(pHead!=null){
			len++;
			pHead=pHead.next;
		}
		return len;
	}

}
