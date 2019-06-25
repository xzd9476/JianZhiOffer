package com.b;

import java.util.LinkedList;
import java.util.Queue;

import com.a.Q树的子结构.TreeNode;

public class K二叉树的深度 {
	/*
	 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
	 */
	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public static int TreeDepth(TreeNode root) {
		if(root == null)
			return 0;
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		int depth=0;
		TreeNode last=root;
		TreeNode theRight=null;
		while(!queue.isEmpty()){
			TreeNode node=queue.poll();
			System.out.println(node.val);
			if(node.left!=null){
				queue.add(node.left);
				theRight=node.left;
			}
			if(node.right!=null){
				queue.add(node.right);
				theRight=node.right;
			}
			if(node==last){
				last=theRight;
				depth++;
			}
		}
		return depth;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left=new TreeNode(9);
		root.right.left = new TreeNode(5);

		TreeNode root2 = new TreeNode(2);
		root2.right = new TreeNode(3);

		System.out.println(TreeDepth(root2));
	}
}
