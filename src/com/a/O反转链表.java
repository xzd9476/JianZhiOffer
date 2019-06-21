package com.a;

import com.a.N链表中倒数第k个结点.ListNode;

public class O反转链表 {
	/*
	 * 输入一个链表，反转链表后，输出新链表的表头。
	 */
	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode ReverseList(ListNode head) {
		if(head == null)
			return null;
		ListNode node1=head.next;
		head.next=null;
		ListNode node2=null;
		while(node1!=null){
			node2=node1.next;
			node1.next=head;
			head=node1;
			node1=node2;
		}
		return head;
	}
	
	public static void main(String[] args) {
		ListNode node=new ListNode(1);
		node.next=new ListNode(2);
		node.next.next=new ListNode(3);
		System.out.println(ReverseList(node).val);
	}

}
