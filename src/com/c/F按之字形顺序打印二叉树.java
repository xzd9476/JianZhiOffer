package com.c;

import java.util.ArrayList;
import java.util.Stack;

public class F按之字形顺序打印二叉树 {
	/*
	 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印， 其他行以此类推。
	 */

	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		int layer = 1;
		// s1存奇数层节点
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		s1.push(pRoot);
		// s2存偶数层节点
		Stack<TreeNode> s2 = new Stack<TreeNode>();

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		while (!s1.empty() || !s2.empty()) {
			if (layer % 2 != 0) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				while (!s1.empty()) {
					TreeNode node = s1.pop();
					if (node != null) {
						temp.add(node.val);
						s2.push(node.left);
						s2.push(node.right);
					}
				}
				if (!temp.isEmpty()) {
					list.add(temp);
					layer++;
				}
			} else {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				while (!s2.empty()) {
					TreeNode node = s2.pop();
					if (node != null) {
						temp.add(node.val);
						s1.push(node.right);
						s1.push(node.left);
					}
				}
				if (!temp.isEmpty()) {
					list.add(temp);
					layer++;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(8);
		root.left.left.left = new TreeNode(6);
		root.left.left.right = new TreeNode(7);
		ArrayList<ArrayList<Integer>> listall = Print(root);
		for (ArrayList<Integer> arrayList : listall) {
			for (Integer integer : arrayList) {
				System.out.print(integer);
			}
		}
	}

}
