package com.a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.a.Q树的子结构.TreeNode;

public class V从上往下打印二叉树 {
	/*
	 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
	 */

	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(root == null)
			return list;
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode node=queue.poll();
			list.add(node.val);
			if(node.left!=null){
				queue.add(node.left);
			}
			if(node.right!=null){
				queue.add(node.right);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left=new TreeNode(5);
		root.left.right=new TreeNode(7);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(5);

		TreeNode root2 = new TreeNode(2);
		root2.right = new TreeNode(3);

		ArrayList<Integer> list=PrintFromTopToBottom(root);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
