package com.a;

public class W二叉搜索树的后序遍历序列 {
	/*
	 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
	 * 二叉搜索树的后序遍历序列特性：提出最后一个数字T，则前面的序列可分为<T的区域和>T的区域
	 */

	public static boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0)
			return true;
		return isBST(sequence, 0, sequence.length - 1);
	}

	private static boolean isBST(int[] sequence, int start, int end) {
		if(end-start<=1)
			return true;
		int mid=start;
		while(mid<end && sequence[mid]<sequence[end])
			mid++;
		for(int i=mid;i<end;i++){
			if(sequence[i]<sequence[end])
				return false;
		}
		return isBST(sequence, start, mid-1) && isBST(sequence, mid, end-1);
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(VerifySquenceOfBST(arr));
	}
}
