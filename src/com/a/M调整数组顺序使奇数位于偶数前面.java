package com.a;

public class M调整数组顺序使奇数位于偶数前面 {
	/*
	 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，
	 * 偶数和偶数之间的相对位置不变。
	 */
	//方法1使用额外的数组结构
	public static void reOrderArray(int [] array) {
		int oddNum=0;
        for (int i : array) {
			if(i%2==0)
				oddNum++;
		}
        int[] newArr=new int[array.length];
        int index=0;
        for(int i=0;i<array.length;i++){
        	if(array[i]%2==0)
        		newArr[array.length-oddNum--]=array[i];
        	else
        		newArr[index++]=array[i];
        }
        for(int i=0;i<newArr.length;i++){
        	array[i]=newArr[i];
        }
    }
	
	//方法2：使用冒泡的思想
	public static void reOrderArray2(int [] array) {
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]%2==0 && array[j+1]%2 == 1){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a={1,3,2,4,6,6};
		reOrderArray2(a);
		for (int i : a) {
			System.out.println(i);
		}
	}

}
