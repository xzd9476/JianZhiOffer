package com.b;

public class W数组中重复的数字 {
	/*
	 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
	 * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
	 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
	 */
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		if(length==0)
			return false;
		int[] arr=new int[length];
		boolean flag=false;
		for(int i=0;i<length;i++){
			arr[numbers[i]]++;
			if(arr[numbers[i]]>1){
				duplication[0]=numbers[i];
				flag=true;
				break;
			}
		}
		return flag;
	}

}
