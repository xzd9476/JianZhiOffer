package com.c;

import java.awt.Robot;
import java.util.Stack;

public class E对称二叉树 {
	/*
	 * 判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
	 */
	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	static boolean  isSymmetrical(TreeNode pRoot) {
		if(pRoot == null)
			return false;
		return check(pRoot.left,pRoot.right);
	}
	
	
	
	private static boolean check(TreeNode left, TreeNode right) {
		if(left == null)
			return right==null;
		if(right == null)
			return left==null;
		if(left.val != right.val)
			return false;
		return check(left.left,right.right) && check(left.right, right.left);
	}



	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(5);
		root.right=new TreeNode(5);
		root.left.left=new TreeNode(6);
		root.right.left=new TreeNode(6);
		System.out.println(isSymmetrical(root));
	}

}
