package com.c;

import java.util.Comparator;
import java.util.PriorityQueue;

public class J数据流中的中位数 {
	/*
	 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
	 * 那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
	 */
	private PriorityQueue<Integer> left=new PriorityQueue<Integer>(11, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);//desc
			//return o1.compareTo(o2);//升序
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
