package com.b;

public class Q��ת����˳������ {
	/*
	 * ���磬��student. a am I������������ʶ������ȷ�ľ���Ӧ���ǡ�I am a student.����
	 * Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô�� *
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
