package com.b;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class C最小的K个数 {
	/*
	 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
	 */
	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		quicklySort(input,0,input.length-1);
		for(int i=0;i<k && input.length>=k;i++){
			list.add(input[i]);
		}
		return list;
	}

	private static void quicklySort(int[] input, int start, int end) {
		if(end>start){
			int k=start;
			for(int i=start;i<=end;i++){
				if(input[i]<input[start]){
					int temp=input[i];
					input[i]=input[start];
					input[start]=temp;
				}
			}
			int temp=input[start];
			input[start]=input[k];
			input[k]=temp;
			
			quicklySort(input, start, k);
			quicklySort(input, k+1, end);
		}
	}

	
	public static void main(String[] args) {
		int[] arr={1,8};
		ArrayList<Integer> list=GetLeastNumbers_Solution(arr, 10);
		System.out.println(list==null);
	}
	

}
