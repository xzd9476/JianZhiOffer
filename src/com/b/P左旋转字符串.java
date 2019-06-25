package com.b;

public class P左旋转字符串 {
	/*
	 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“
	 * XYZdefabc”。是不是很简单？OK，搞定它！ 思路先将abc 和 XYZdef翻转---》cbafedZYX
	 * 在将整体翻转--->XYZdefabc
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
