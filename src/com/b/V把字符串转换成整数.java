package com.b;

public class V把字符串转换成整数 {
	/*
	 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
	 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
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
