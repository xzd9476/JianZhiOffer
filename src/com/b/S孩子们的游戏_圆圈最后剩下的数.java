package com.b;

public class S孩子们的游戏_圆圈最后剩下的数 {
	/*
	 * 随机指定一个数m,让编号为0的小朋友开始报数。每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
	 * 从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版
	 * (名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
	 */
	public static int LastRemaining_Solution(int n, int m) {
		if(n<1 || m<1)
			return -1;
		int[] arr = new int[n];
		int cur = -1,m2 = 0,num = n;
		while (num >0 ) {
			if (++cur == n)
				cur = 0;
			if (arr[cur] != -1) {
				m2++;
				if (m2 == m) {
					m2 = 0;
					arr[cur] = -1;
					num--;
				}
			}
		}
		return cur;
	}
}
