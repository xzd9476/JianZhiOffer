package com.b;

public class E整数中出现1的次数 {
	/*
	 *求出任意非负整数区间中1出现的次数（从1到 n 中1出现的次数）。111出现三次  110出现两次
	 *如1~13中包含1的数字有1、10、11、12、13
	 */
	public int NumberOf1Between1AndN_Solution(int n) {
	    int count=0;
	    int current=0;
	    int before=0;
	    int after=0;
	    for(int i=1;i<=n;i*=10){
	    	current=(n/i)%10;
	    	before=n/(i*10);
	    	after=n%i;
	    	
	    	if(current==0)
	    		count+=before*i;
	    	else if(current==1)
	    		count+=before*i+after+1;
	    	else
	    		count+=(before+1)*i;
	    }
	    return count;
    }
	

}
