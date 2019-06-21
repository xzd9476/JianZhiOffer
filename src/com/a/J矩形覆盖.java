package com.a;

public class J矩形覆盖 {
	/*
	 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
	 */
	public int RectCover(int target) {
		 if(target<=2)
			 return target;
		 int n1=1;
		 int n2=2;
		 int sum=0;
		 while(--target>1){
			 sum=n1+n2;
			 n1=n2;
			 n2=sum;
		 }
		 return sum;
	}
}
