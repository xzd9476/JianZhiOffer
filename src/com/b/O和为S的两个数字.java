package com.b;

import java.util.ArrayList;

public class O和为S的两个数字 {
	/*
	 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
	 */
	public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> res=new ArrayList<Integer>();
		int l=0;
		int r=array.length-1;
		while(l<=r){
			if(array[l]+array[r]==sum){
				res.add(array[l]);
				res.add(array[r]);
				break;
			}else if(array[l]+array[r]>sum){
				r--;
			}else{
				l++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		ArrayList<Integer> list = FindNumbersWithSum(arr, 21);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
