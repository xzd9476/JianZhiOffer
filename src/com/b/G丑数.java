package com.b;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class G丑数 {
	/*
	 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
	 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
	 */
	public static int GetUglyNumber_Solution(int index) {
		if(index<=6)
			return index;
		int i2=0,i3=0,i5=0;
		int[] uglyArr=new int[index];
		uglyArr[0]=1;
		for(int i=1;i<index;i++){
			int nex2=uglyArr[i2]*2,nex3=uglyArr[i3]*3,nex5=uglyArr[i5]*5;
			uglyArr[i]=Math.min(nex2, Math.min(nex3, nex5));
			if(uglyArr[i]==nex2)
				i2++;
			if(uglyArr[i]==nex3)
				i3++;
			if(uglyArr[i]==nex5)
				i5++;
		}
		return uglyArr[index-1];
	}
	
	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(8));
	}

}
