package com.c;

public class A字符流中第一个不重复的字符 {
	/*
	 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
	 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
	 */
	
	// Insert one char from stringstream
	int[] arr=new int[256];
	int index=1;
	public void Insert(char ch) {
		if(arr[ch]==0)
			arr[ch]=index++;
		else
			arr[ch]=-1;
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce() {
		int min=Integer.MAX_VALUE;
		char res='#';
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0 && arr[i]!=-1 && min>arr[i]){
				min=arr[i];
				res=(char)i;
			}
		}
		return res;
	}

}
