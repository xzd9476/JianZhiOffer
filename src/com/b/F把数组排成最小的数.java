package com.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class F�������ų���С���� {
	/*
	 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}��
	 * ���ӡ���������������ųɵ���С����Ϊ321323��
	 */
	public static String PrintMinNumber(int [] numbers) {
		String s="";
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<numbers.length;i++){
			list.add(numbers[i]);
		}
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				String str1=o1+""+o1;
				String str2=o2+""+o1;
				return str1.compareTo(str2);
			}
		});
		for (Integer integer : list) {
			s+=integer;
		}
		return s;
	}

//	public static String PrintMinNumber(int[] numbers) {
//		if(numbers.length==0)
//			return "";
//		for(int i=0;i<numbers.length;i++){
//			for(int j=0;j<numbers.length-i-1;j++){
//				String tempStr=String.valueOf(numbers[j])+String.valueOf(numbers[j+1]);
//				String tempStr2=String.valueOf(numbers[j+1])+String.valueOf(numbers[j]);
//				if(Long.valueOf(tempStr)>Long.valueOf(tempStr2)){
//					int temp=numbers[j];
//					numbers[j]=numbers[j+1];
//					numbers[j+1]=temp;
//				}
//			}
//			
//		}
//		StringBuilder sb=new StringBuilder("");
//		for(int i=0;i<numbers.length;i++){
//			sb.append(String.valueOf(numbers[i]));
//		}
//		return String.valueOf(sb);
//	}

	public static void main(String[] args) {
		int[] arr={3334,3,3333332};
		String str=PrintMinNumber(arr);
		System.out.println(str);
	}
}
