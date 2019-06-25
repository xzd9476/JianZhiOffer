package com.b;

public class J数字在排序数组中出现的次数 {
	/*
	 * 统计一个数字在排序数组中出现的次数。
	 */
	private static int index;
	public static int GetNumberOfK(int[] array, int k) {
		int start=0;
		int end=array.length-1;
		int index=0;
		while(end>start){
			int mid=start+(end-start)/2;
			if(array[mid]==k){
				index=mid;
				end=mid;
			}else if(array[mid]<k){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		int num=0;
		for(int i=index;i<array.length;i++){
			if(array[i]==k)
				num++;
			else
				break;
		}
		return num;
	}

	private static void serchNum(int[] array, int start, int end,int num) {
		if(end>start){
			int mid=start+(end-start)/2;
			if(array[mid]<num){
				serchNum(array, mid+1, end, num);
			}else if(array[mid]==num){
				index=mid;
				serchNum(array, start, mid, num);
			}else{
				serchNum(array, start, mid, num);
			}
		}
	}
	
	public static void main(String[] args) {
		int [] arr={1,3,4,5,7,7,7,8};
		System.out.println(GetNumberOfK(arr,7));
	}

}
