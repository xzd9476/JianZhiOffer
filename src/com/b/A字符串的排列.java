package com.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class A字符串的排列 {
	/*
	 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
	 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
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
