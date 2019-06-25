package com.b;

import java.util.ArrayList;

public class M数组中出现一次的数字 {
	/*
	 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
	 */

	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		int n=0;
		for(int i=0;i<array.length;i++){
			n=n^array[i];
		}
		int j=1;
		while((j&n)==0){
			j=j<<1;
		}
		for(int i=0;i<array.length;i++){
			if((array[i]&j)==0)
				num1[0]=num1[0]^array[i];
			else
				num2[0]=num2[0]^array[i];
		}
	}
}
