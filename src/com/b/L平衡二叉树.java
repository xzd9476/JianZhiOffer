package com.b;

import com.b.K�����������.TreeNode;

public class Lƽ������� {
	/*
	 * ����һ�ö��������жϸö������Ƿ���ƽ���������
	 * ƽ��������������������������������Ȳ����1
	 */

	public boolean IsBalanced_Solution(TreeNode root) {
		return isBTree(root)>=0;
	}
	
	public int isBTree(TreeNode node){
		if(node == null)
			return 0;
		int lh=isBTree(node.left);
		int rh=isBTree(node.right);
		
		if(Math.abs(lh-rh)>1)
			return -1;
		if(lh==-1 || rh==-1)
			return -1;
		return Math.max(lh+1, rh+1);
	}
}
