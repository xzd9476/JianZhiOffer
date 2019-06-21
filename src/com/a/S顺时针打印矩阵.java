package com.a;

import java.util.ArrayList;

public class SË³Ê±Õë´òÓ¡¾ØÕó {
	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int rowlength = matrix[0].length;
		int columnlength = matrix.length;

		int minlength = rowlength > columnlength ? columnlength : rowlength;
		int minnum = (int) Math.ceil((double) minlength / 2);
		for (int i = 0; i < minnum; i++) {
			zhuanquan(matrix,list, i, rowlength, columnlength);
		}
		return list;
	}

	private static void zhuanquan(int[][] matrix, ArrayList<Integer> list, int i, int rowlength, int columnlength) {
		int endy=columnlength-i-1;//ÓÒÏÂ½Çy
		int endx=rowlength-i-1;//ÓÒÏÂ½Çx
		System.out.println("pp"+endx+i+endy);
		for (int j = i; j <= endx; j++) {
			System.out.println(j);
			list.add(matrix[i][j]);
		}
		if(endy>i){
			for (int j = i+1; j <= endy; j++) {
				list.add(matrix[j][endx]);
			}
		}
		if (endx>i&&endy>i) {
			for (int j = endx-1; j >=i; j--) {
				list.add(matrix[endy][j]);
			}
		}
		if(endx>i&&endy-1>i){
			for (int j = endy-1; j >= i+1; j--) {
				list.add(matrix[j][i]);
			}
		}

	}
	
	public static void main(String[] args) {
		int [][] matrix={{1},{2},{3},{4},{5}};
		ArrayList<Integer> arr=printMatrix(matrix);
		for (Integer integer : arr) {
			System.out.println(integer);
		}
	}

}
