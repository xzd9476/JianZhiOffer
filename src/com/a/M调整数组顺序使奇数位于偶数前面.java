package com.a;

public class M��������˳��ʹ����λ��ż��ǰ�� {
	/*
	 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�����֤������������
	 * ż����ż��֮������λ�ò��䡣
	 */
	//����1ʹ�ö��������ṹ
	public static void reOrderArray(int [] array) {
		int oddNum=0;
        for (int i : array) {
			if(i%2==0)
				oddNum++;
		}
        int[] newArr=new int[array.length];
        int index=0;
        for(int i=0;i<array.length;i++){
        	if(array[i]%2==0)
        		newArr[array.length-oddNum--]=array[i];
        	else
        		newArr[index++]=array[i];
        }
        for(int i=0;i<newArr.length;i++){
        	array[i]=newArr[i];
        }
    }
	
	//����2��ʹ��ð�ݵ�˼��
	public static void reOrderArray2(int [] array) {
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]%2==0 && array[j+1]%2 == 1){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a={1,3,2,4,6,6};
		reOrderArray2(a);
		for (int i : a) {
			System.out.println(i);
		}
	}

}
