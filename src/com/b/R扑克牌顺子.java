package com.b;

public class R�˿���˳�� {
	/*
	 * һ���˿���54���ƣ������е��˿���56��(���������)
	 * �� �� ���Ա��κ��ƣ�Ϊ���������������0
	 * ������ó�5���ƣ����Ƿ���˳��
	 */
	public static boolean isContinuous(int [] numbers) {
		if(numbers.length==0)
			return false;
		int min=14;
		int max=-1;
		int[] isDouble=new int[14];
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]>max && numbers[i]!=0)
				max=numbers[i];
			if(numbers[i]<min && numbers[i]!=0)
				min=numbers[i];
			isDouble[numbers[i]]++;
		}
		if(max-min>4)
			return false;
		for(int i=1;i<isDouble.length;i++){
			if(isDouble[i]>1)
				return false;
		}
		return true;
    }
	
	public static void main(String[] args) {
		int[] arr={0,0,0,0,2};
		System.out.println(isContinuous(arr));
	}

}
