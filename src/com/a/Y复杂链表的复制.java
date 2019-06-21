package com.a;

import java.util.Random;

import com.a.C从头到尾打印链表.ListNode;

public class Y复杂链表的复制 {
	/*
	 * 输入一个复杂链表 （每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点）， 返回结果为复制后复杂链表的head。
	 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
	 */

	public static class RandomListNode {
		int label;
		RandomListNode next = null;
		RandomListNode random = null;

		RandomListNode(int label) {
			this.label = label;
		}
	}

	public static RandomListNode Clone(RandomListNode pHead) {
		if(pHead==null)
			return null;
		RandomListNode temp=pHead;
		while(temp!=null){
			RandomListNode node=new RandomListNode(temp.label);
			node.next=temp.next;
			temp.next=node;
			temp=node.next;
		}
		temp=pHead;
		while(temp!=null){
			RandomListNode node=temp.next;
			if(temp.random!=null){
				node.random=temp.random.next;//A'指向C'
			}
			temp=node.next;
		}
		//拆分
		temp=pHead;
		RandomListNode res=pHead.next;
		RandomListNode temp2;
		while(temp.next!=null){
			temp2=temp.next;
			temp.next=temp2.next;
			temp=temp2;
		}
		return res;
	}
	
	public static void main(String[] args) {
		RandomListNode node=new RandomListNode(1);
		node.next=new RandomListNode(2);
		node.next.next=new RandomListNode(3);
		node.next.next.next=new RandomListNode(4);
		
		RandomListNode root=Clone(node);
		while(root!=null){
			System.out.println(root.label);
			root=root.next;
		}
	}

}
