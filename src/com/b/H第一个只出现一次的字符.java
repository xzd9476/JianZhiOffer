package com.b;

public class H��һ��ֻ����һ�ε��ַ� {
	/*
	 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û���򷵻�
	 * -1����Ҫ���ִ�Сд��.
	 */
	public static int FirstNotRepeatingChar(String str) {
		int[] numArr=new int[256];
		char[] strArr=str.toCharArray();
		int res=-1;
		for(int i=0;i<strArr.length;i++){
			numArr[strArr[i]]++;
		}
		for(int i=0;i<strArr.length;i++){
			if(numArr[strArr[i]]==1){
				res=i;
				break;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar("eee"));
		
	}

}
