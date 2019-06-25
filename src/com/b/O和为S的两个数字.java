package com.b;

import java.util.ArrayList;

public class O��ΪS���������� {
	/*
	 * ����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
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
