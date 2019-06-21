package com.a;

import com.a.Q树的子结构.TreeNode;

public class R二叉树的镜像 {
	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	public static void Mirror(TreeNode root) {
		if(root==null)
			return ;
		Mirror(root.left);
		Mirror(root.right);
		TreeNode node=root.left;
		root.left=root.right;
		root.right=node;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(5);

		Mirror(root);
		System.out.println(root.right.val);
	}

}
