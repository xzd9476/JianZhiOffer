package com.a;

import java.util.Stack;

public class Uջ��ѹ�뵯������ {
	/*
	 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�
	 * ��������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
	 * ��ע�⣺���������еĳ�������ȵģ�
	 */
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
	      Stack<Integer> stack=new Stack<Integer>();
	      int j=0;
	      for(int i=0;i<pushA.length;i++){
	    	 stack.push(pushA[i]);
	    	 while(!stack.isEmpty() && stack.peek()==popA[j]){
	    		 stack.pop();
	    		 j++;
	    	 }
	      }
	      return stack.isEmpty();
    }
	
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int[] arr2={4,5,2,3,1};
		System.out.println(IsPopOrder(arr, arr2));
	}

}
