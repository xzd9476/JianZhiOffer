package com.c;

import java.util.ArrayList;
import java.util.Stack;

public class F��֮����˳���ӡ������ {
	/*
	 * ��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ�� �������Դ����ơ�
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
		// s1��������ڵ�
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		s1.push(pRoot);
		// s2��ż����ڵ�
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
