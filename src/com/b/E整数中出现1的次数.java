package com.b;

public class E�����г���1�Ĵ��� {
	/*
	 *�������Ǹ�����������1���ֵĴ�������1�� n ��1���ֵĴ�������111��������  110��������
	 *��1~13�а���1��������1��10��11��12��13
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
