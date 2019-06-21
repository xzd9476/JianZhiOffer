package com.a;

import java.util.Stack;


public class N链表中倒数第k个结点 {
	/*
	 * 输入一个链表，输出该链表中倒数第k个结点。
	 */
	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode FindKthToTail(ListNode head, int k) {
		ListNode p=head;
		ListNode q=head;
		while(k-->0 && q!=null){
			q=q.next;
		}
		if (k>-1)
			return null;
		while(q!=null){
			p=p.next;
			q=q.next;
		}
		return p;
	}
	
	public static void main(String[] args) {
		ListNode node=new ListNode(1);
		node.next=new ListNode(2);
		node.next.next=new ListNode(3);
		System.out.println(FindKthToTail(node, 2).val);
	}

}
