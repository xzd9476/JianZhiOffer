package com.a;

public class B�滻�ո� {
	/*
	 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20���� ���磬���ַ���ΪWe Are Happy
	 * �򾭹��滻֮����ַ���ΪWe%20Are%20Happy
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
