package com.c;

public class A�ַ����е�һ�����ظ����ַ� {
	/*
	 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ��� ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
	 * ���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
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
