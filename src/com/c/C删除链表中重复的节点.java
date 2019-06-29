package com.c;

public class Cɾ���������ظ��Ľڵ� {
	/*
	 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣 ���磬����1->2->3->3->4->4->5
	 * �����Ϊ 1->2->5
	 */
	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode deleteDuplication(ListNode pHead) {
		if(pHead == null || pHead.next==null)
			return pHead;
		ListNode head=new ListNode(-1);
		head.next=pHead;
		
		ListNode pre=head;
		ListNode last=head.next;
		
		while(last!=null){
			if(last.next!=null && last.val==last.next.val){
				while(last.next!=null && last.val==last.next.val)
					last=last.next;
				pre.next=last.next;
				last=last.next;
			}else{
				pre=pre.next;
				last=last.next;
			}
		}
		return head.next;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(3);
		ListNode res = deleteDuplication(node);
		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}

}
