package com.b;

public class Q翻转单次顺序序列 {
	/*
	 * 例如，“student. a am I”。后来才意识到，正确的句子应该是“I am a student.”。
	 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？ *
	 */

	public static String ReverseSentence(String str) {
		if (str.length() == 0)
			return "";
		char[] strArr = str.toCharArray();
		reserve(strArr, 0, strArr.length - 1);
		int start = 0;
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] == ' ' || i == strArr.length - 1) {
				reserve(strArr, start, i == strArr.length - 1 ? i : i - 1);
				start = i + 1;
			}
		}
		return String.valueOf(strArr);
	}

	private static void reserve(char[] strArr, int start, int end) {
		if (end >= start) {
			int j = end;
			for (int i = start; i <= start + (end - start) / 2; i++) {
				char temp = strArr[i];
				strArr[i] = strArr[j];
				strArr[j--] = temp;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println(ReverseSentence("I am a student."));
	}

}
