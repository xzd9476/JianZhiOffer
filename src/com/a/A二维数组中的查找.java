package com.a;

public class A��ά�����еĲ��� {
	/*
	 * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
	 * ����������һ����ά�����һ���������ж��������Ƿ��и�������
	 */
	public boolean Find(int target, int [][] array) {
		if(array == null)
			return false;
		int row=0;
        int col=array[0].length-1;
        while(row < array.length && col>=0){
        	if(target == array[row][col])
        		return true;
        	else if(target > array[row][col])
        		row++;
        	else
        		col--;
        }
		return false;
    }
}
