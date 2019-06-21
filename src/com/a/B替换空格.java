package com.a;

public class B替换空格 {
	/*
	 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。 例如，当字符串为We Are Happy
	 * 则经过替换之后的字符串为We%20Are%20Happy
	 */
	public static String replaceSpace(StringBuffer str) {
		int P1=str.length()-1;
		for (int i = 0; i <= P1; i++) {
			if(str.charAt(i)==' ')
				str.append("  ");
		}
		int P2=str.length()-1;
		for(int i=P1;i>=0;i--){
			if(str.charAt(i)==' '){
				str.setCharAt(P2--,'0');
				str.setCharAt(P2--,'2');
				str.setCharAt(P2--,'%');
			}else{
				str.setCharAt(P2--, str.charAt(i));
			}
		}
		return String.valueOf(str);
	}
	
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("helloworld ");
		System.out.println(replaceSpace(str));
	}

}
