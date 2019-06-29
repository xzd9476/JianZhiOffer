package com.c;

import com.b.I数组中的逆序对.ListNode;

public class B链表中环的入口结点 {
	/*
	 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
	 */
	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode EntryNodeOfLoop(ListNode pHead) {
		ListNode head1=pHead;
		ListNode head2=pHead;
		while(head1!=null && head2!=null){
			head1=head1.next;
			if(head2.next!=null)
				head2=head2.next.next;
			if(head1==head2)
				break;
		}
		if(head1!=head2)
			return null;
		head2=pHead;
		while(head1!=null && head2!=null){
			if(head1==head2){
				return head1;
			}else{
				head1=head1.next;
				head2=head2.next;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		ListNode node=new ListNode(1);
		System.out.println(EntryNodeOfLoop(node));
	}

}
