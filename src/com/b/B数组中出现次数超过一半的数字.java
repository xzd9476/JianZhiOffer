package com.b;

public class B数组中出现次数超过一半的数字 {
	/*
	 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
	 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
	 */

	/*
	 * 
	 * 采用阵地攻守的思想： 第一个数字作为第一个士兵，守阵地；count = 1； 遇到相同元素，count++;
	 * 遇到不相同元素，即为敌人，同归于尽,count--；当遇到count为0的情况，又以新的i值作为守阵地的士兵，继续下去，到最后还留在阵地上的士兵，
	 * 有可能是主元素。 再加一次循环，记录这个士兵的个数看是否大于数组一般即可。
	 */
	public int MoreThanHalfNum_Solution(int[] array) {
		if(array.length==0)
			return 0;
		int flag=array[0];
		int count=1;
		for(int i=1;i<array.length;i++){
			count=array[i]== flag ? count+1 :count-1;
			if(count==0){
				flag=array[i];
				count=1;
			}
		}
		count=0;
		for(int i=0;i<array.length;i++)
			if(array[i]==flag)
				count++;
		return count>array.length/2 ? flag : 0;
	}
	

}
