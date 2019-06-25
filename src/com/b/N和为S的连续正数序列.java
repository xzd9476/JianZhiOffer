package com.b;

import java.util.ArrayList;

public class N和为S的连续正数序列 {
	/*
	 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,
	 * 他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
	 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
	 */
	
	//常规解法
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
	
	//递归解法
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
