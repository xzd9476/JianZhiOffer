package com.a;

import java.util.ArrayList;
import java.util.Stack;

public class C从头到尾打印链表 {
	/*
	 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
	 */
	public static class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(listNode!=null){
			list.add(listNode.val);
			listNode=listNode.next;
		}
		int j=list.size()-1;
		for(int i=0;i<list.size()/2;i++){
			int temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j--, temp);
		}
		return list;
	}
	
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack=new Stack<Integer>();
		while(listNode!=null){
			stack.push(listNode.val);
			listNode=listNode.next;
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(!stack.isEmpty()){
			list.add(stack.pop());
		}
		return list;
		
	}
	
	public static void main(String[] args) {
		ListNode node=new ListNode(1);
		node.next=new ListNode(2);
		node.next.next=new ListNode(3);
		node.next.next.next=new ListNode(4);
		
		ArrayList<Integer> list=printListFromTailToHead(node);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
