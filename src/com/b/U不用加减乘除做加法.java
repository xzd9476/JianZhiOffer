package com.b;

public class U���üӼ��˳����ӷ� {
	/*
	 * дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
	 */
	public static int Add(int num1,int num2) {
		if(num2==0)
			return num1;
		return Add((num1^num2), (num1&num2)<<1);
    }
	
	public static void main(String[] args) {
		System.out.println(Add(5, 7));
	}

}
