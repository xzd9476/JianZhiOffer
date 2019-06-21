package com.a;

import java.util.Stack;


public class Z������������˫������ {
	/*
	 * ����һ�ö��������������ö���������ת����һ�������˫������ Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
	 */
	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	//�ǵݹ�汾
	public static TreeNode Convert(TreeNode pRootOfTree) {
		if (pRootOfTree == null)
			return null;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode pre = null;
		TreeNode res = null;
		boolean flag = true;
		while (!stack.isEmpty() || pRootOfTree != null) {
			if (pRootOfTree != null) {
				stack.push(pRootOfTree);
				pRootOfTree = pRootOfTree.left;
			} else {
				TreeNode node = stack.pop();
				if (flag) {// ����ǵ�һ��
					flag = false;
					res = node;
					pre=node;
				}else{
					pre.right=node;
					node.left=pre;
					pre=node;
				}
				pRootOfTree = node.right;
			}
		}
		return res;
	}
	
	//�ݹ�汾
	private static TreeNode pre=null;
	private static TreeNode head=null;
	public static TreeNode Convert2(TreeNode pRootOfTree) {
		inOrder(pRootOfTree);
		return head;
	}

	private static void inOrder(TreeNode node) {
		if(node==null)
			return;
		inOrder(node.left);
		
		node.left=pre;
		if(pre!=null)
			pre.right=node;
		pre=node;
		if(head==null)
			head=node;
		
		inOrder(node.right);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(7);
		// root.right.left = new TreeNode(5);

	}

}
