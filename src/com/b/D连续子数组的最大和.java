package com.b;

public class D连续子数组的最大和 {
	/*
	 * 计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,
	 * 并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。给一个数组，
	 * 返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
	 */
	public int FindGreatestSumOfSubArray(int[] array) {
		if(array.length==0)
			return 0;
		int temp=0;
		int max=-2147483648;
		for(int i=0;i<array.length;i++){
			if(temp<=0){
				temp=array[i];
			}else{
				temp+=array[i];
			}
			if(temp>max)
				max=temp;
		}
		return max;
	}

}
