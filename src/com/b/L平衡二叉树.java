package com.b;

import com.b.K二叉树的深度.TreeNode;

public class L平衡二叉树 {
	/*
	 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
	 * 平衡二叉树：左子树的深度与右子树的深度差不超过1
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
