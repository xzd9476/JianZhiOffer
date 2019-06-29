package com.c;

import java.util.Comparator;
import java.util.PriorityQueue;

public class J�������е���λ�� {
	/*
	 * ��εõ�һ���������е���λ����������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��������������ж���ż������ֵ��
	 * ��ô��λ������������ֵ����֮���м���������ƽ��ֵ������ʹ��Insert()������ȡ��������ʹ��GetMedian()������ȡ��ǰ��ȡ���ݵ���λ����
	 */
	private PriorityQueue<Integer> left=new PriorityQueue<Integer>(11, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);//desc
			//return o1.compareTo(o2);//����
		}
	});
	private PriorityQueue<Integer> right=new PriorityQueue<Integer>();
	private int N;
	public void Insert(Integer num) {
		if(N%2==0){
			right.add(num);
			left.add(right.poll());
		}else{
			left.add(num);
			right.add(left.poll());
		}
		N++;
	}

	public Double GetMedian() {
		if(N%2==0){
			return (double)(left.peek()+right.peek())/2;
		}else{
			return (double)left.peek();
		}
	}

}
