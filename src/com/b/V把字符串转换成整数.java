package com.b;

public class V���ַ���ת�������� {
	/*
	 * ��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�����string����������Ҫ��ʱ����0)��
	 * Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��
	 */
	public static int StrToInt(String str) {
		int k=1;
		int res=0;
		for(int i=str.length()-1;i>=0;i--){
			int num=str.charAt(i);
			if(num<='9' && num>='0'){
				res+=(num-'0')*k;
				k*=10;
			}else if((num=='+' || num=='-') && i==0){
				res=num=='-'?res*-1:res;
			}else{
				return 0;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(StrToInt("-998"));
		System.out.println('+'*1);
		System.out.println('-'*1);
		System.out.println('a'*1);
		System.out.println('A'*1);
	}

}
