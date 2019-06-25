package com.b;

import java.util.ArrayList;

public class N��ΪS�������������� {
	/*
	 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100�����������������ڴ�,
	 * �����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
	 * ���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
	 */
	
	//����ⷨ
	public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	       ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
	       int plow=1,phigh=2;
	       while(phigh>plow){
	    	   int cur=(phigh+plow)*(phigh-plow+1)/2;
	    	   if(cur==sum){
	    		   ArrayList<Integer> list=new ArrayList<Integer>();
	    		   for(int i=plow;i<=phigh;i++){
	    			   list.add(i);
	    		   }
	    		   res.add(list);
	    		   plow++;
	    	   }else if(cur < sum){
	    		   phigh++;
	    	   }else{
	    		   plow++;
	    	   }
	       }
	       return res;
    }
	
	//�ݹ�ⷨ
	private static ArrayList<ArrayList<Integer>> listAll=new ArrayList<ArrayList<Integer>>();
	public static ArrayList<ArrayList<Integer>> FindContinuousSequence2(int sum) {
		for(int i=1;i<=sum/2;i++){
			ArrayList<Integer> list=new ArrayList<Integer>();
			findSequence(sum, i,list);
		}
		return listAll;
	}
	private static void findSequence(int sum, int start,ArrayList<Integer> list) {
		if(start>sum)
			return;
		list.add(start);
		sum=sum-start;
		if(sum==0)
			listAll.add(list);
		findSequence(sum, start+1,list);
	}
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> listAll=FindContinuousSequence(100);
		for (ArrayList<Integer> arrayList : listAll) {
			System.out.println("----");
			for (Integer integer : arrayList) {
				System.out.println(integer);
			}
		}
	}

}
