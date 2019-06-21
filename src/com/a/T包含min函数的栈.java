package com.a;

import java.util.Stack;

public class T����min������ջ {
	/*
	 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
	 */
	private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
		if(stack2.isEmpty() || stack2.peek()>node){
			stack2.push(node);
		}else{
			stack2.push(stack2.peek());
		}
	}

	public void pop() {
		stack1.pop();
		stack2.pop();
	}

	public int top() {
		if (!stack1.isEmpty())
			return stack1.peek();
		else
			return 0;
	}

	public int min() {
		if (!stack2.isEmpty())
			return stack2.peek();
		else
			return 0;
	}
}
