package com.b;

import java.util.ArrayList;

public class M�����г���һ�ε����� {
	/*
	 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
	 */

	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		int n=0;
		for(int i=0;i<array.length;i++){
			n=n^array[i];
		}
		int j=1;
		while((j&n)==0){
			j=j<<1;
		}
		for(int i=0;i<array.length;i++){
			if((array[i]&j)==0)
				num1[0]=num1[0]^array[i];
			else
				num2[0]=num2[0]^array[i];
		}
	}
}
