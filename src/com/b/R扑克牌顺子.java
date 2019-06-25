package com.b;

public class R扑克牌顺子 {
	/*
	 * 一副扑克有54张牌，本题中的扑克有56张(多给两张王)
	 * 设 王 可以变任何牌，为方便起见，王看作0
	 * 求从中拿出5张牌，求是否是顺子
	 */
	public static boolean isContinuous(int [] numbers) {
		if(numbers.length==0)
			return false;
		int min=14;
		int max=-1;
		int[] isDouble=new int[14];
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]>max && numbers[i]!=0)
				max=numbers[i];
			if(numbers[i]<min && numbers[i]!=0)
				min=numbers[i];
			isDouble[numbers[i]]++;
		}
		if(max-min>4)
			return false;
		for(int i=1;i<isDouble.length;i++){
			if(isDouble[i]>1)
				return false;
		}
		return true;
    }
	
	public static void main(String[] args) {
		int[] arr={0,0,0,0,2};
		System.out.println(isContinuous(arr));
	}

}
