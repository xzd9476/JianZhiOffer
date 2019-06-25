package com.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class A�ַ��������� {
	/*
	 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
	 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
	 */
	public ArrayList<String> Permutation(String str) {
		ArrayList<String> list=new ArrayList<String>();
		if(str!=null && str.length()>0){
			PremutationHelper(str.toCharArray(),0,list);
			Collections.sort(list);
		}
		return list;
	}

	private void PremutationHelper(char[] chars, int i, ArrayList<String> list) {
		if( i == chars.length-1){
			list.add(String.valueOf(chars));
		}else{
			Set<Character> charSet=new HashSet<Character>();
			for(int j=i;j<chars.length;++j){
				if(j==i || !charSet.contains(chars[j])){
					charSet.add(chars[j]);
					swap(chars,i,j);
					PremutationHelper(chars, i+1, list);
					swap(chars,j,i);
				}
			}
		}
		
	}

	private void swap(char[] chars, int j, int i) {
		// TODO Auto-generated method stub
		char temp=chars[i];
		chars[i]=chars[j];
		chars[j]=temp;
	}
	
	

}
