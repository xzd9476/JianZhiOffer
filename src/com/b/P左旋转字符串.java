package com.b;

public class P����ת�ַ��� {
	/*
	 * ����һ���������ַ�����S���������ѭ������Kλ���������������磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������
	 * XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨���� ˼·�Ƚ�abc �� XYZdef��ת---��cbafedZYX
	 * �ڽ����巭ת--->XYZdefabc
	 */
	public static String LeftRotateString(String str, int n) {
		if (str.length() == 0)
			return "";
		char[] strArr = str.toCharArray();
		resever(strArr, 0, n - 1);
		resever(strArr, n, strArr.length - 1);
		resever(strArr, 0, strArr.length - 1);
		return String.valueOf(strArr);
	}

	private static void resever(char[] strArr, int start, int end) {
		while (start <= end) {
			char temp = strArr[start];
			strArr[start++] = strArr[end];
			strArr[end--] = temp;
		}
	}

	public static void main(String[] args) {
		String s = "abcdefg";
		System.out.println(LeftRotateString(s, 7));
	}
}
