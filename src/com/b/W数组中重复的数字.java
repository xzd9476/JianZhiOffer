package com.b;

public class W�������ظ������� {
	/*
	 * ��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ�
	 * ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡�
	 * ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2��
	 */
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		if(length==0)
			return false;
		int[] arr=new int[length];
		boolean flag=false;
		for(int i=0;i<length;i++){
			arr[numbers[i]]++;
			if(arr[numbers[i]]>1){
				duplication[0]=numbers[i];
				flag=true;
				break;
			}
		}
		return flag;
	}

}
