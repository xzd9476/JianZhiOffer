package com.a;

public class W�����������ĺ���������� {
	/*
	 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��
	 * �����������ĺ�������������ԣ�������һ������T����ǰ������пɷ�Ϊ<T�������>T������
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
