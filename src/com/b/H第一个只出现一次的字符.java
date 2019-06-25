package com.b;

public class H第一个只出现一次的字符 {
	/*
	 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回
	 * -1（需要区分大小写）.
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
