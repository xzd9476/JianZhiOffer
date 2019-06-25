package com.b;

public class Z表示数值的字符串 {
	/*
	 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
	 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
	 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
	 */
	public boolean isNumeric(char[] str) {
		boolean hasE=false,hasDecimal=false,hasSign=false;
		for(int i=0;i<str.length;i++){
			if(str[i]=='E' || str[i]=='e'){
				if(i==str.length-1 || hasE)
					return false;
				hasE=true;
			}else if(str[i]=='+' || str[i]=='-'){
				if(hasSign && str[i-1]!='e' && str[i-1]!='E')//第二次出现sign，必在e E后面
					return false;
				if(!hasSign && i!=0 && str[i-1]!='e' && str[i-1]!='E')//第一次出现sign
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
