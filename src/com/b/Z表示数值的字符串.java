package com.b;

public class Z��ʾ��ֵ���ַ��� {
	/*
	 * ��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
	 * ���磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ��
	 * ����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
	 */
	public boolean isNumeric(char[] str) {
		boolean hasE=false,hasDecimal=false,hasSign=false;
		for(int i=0;i<str.length;i++){
			if(str[i]=='E' || str[i]=='e'){
				if(i==str.length-1 || hasE)
					return false;
				hasE=true;
			}else if(str[i]=='+' || str[i]=='-'){
				if(hasSign && str[i-1]!='e' && str[i-1]!='E')//�ڶ��γ���sign������e E����
					return false;
				if(!hasSign && i!=0 && str[i-1]!='e' && str[i-1]!='E')//��һ�γ���sign
					return false;
				hasSign=true;
			}else if(str[i]=='.'){
				if(hasDecimal || hasE)
					return false;
				hasDecimal=true;
			}else if(str[i]<'0' || str[i]>'9'){
				return false;
			}
		}
		return true;
	}

}
