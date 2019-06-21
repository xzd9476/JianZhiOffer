package com.a;

import java.util.Random;

import com.a.C��ͷ��β��ӡ����.ListNode;

public class Y��������ĸ��� {
	/*
	 * ����һ���������� ��ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩�� ���ؽ��Ϊ���ƺ��������head��
	 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
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
				node.random=temp.random.next;//A'ָ��C'
			}
			temp=node.next;
		}
		//���
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
