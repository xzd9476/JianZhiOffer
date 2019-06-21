package com.a;

public class H跳台阶 {
	/*
	 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
	 * 对于一个n阶台阶，第一次跳1阶剩下n-1阶，第一次跳2阶剩下n-2阶级
	 * 对于剩下的n-1 n-2又分别有n-1 n-2
	 * 所以是个斐波那契数列
	 */
	public int JumpFloor(int target) {
		if(target==0)
			return 0;
		if(target==1)
			return 1;
		int n1=1;
		int n2=2;
		int sum=2;
		while(--target>1){
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		return sum;
	}

}
