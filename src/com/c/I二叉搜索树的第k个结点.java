package com.c;

import java.util.Stack;

public class I�����������ĵ�k����� {
	/*
	 * ����һ�ö��������������ҳ����еĵ�kС�Ľ�㡣���磬 ��5��3��7��2��4��6��8�� �У��������ֵ��С˳�����С����ֵΪ4��
	 */

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	TreeNode KthNode(TreeNode pRoot, int k) {
		Stack<TreeNode> stack=new Stack<TreeNode>();
		while(pRoot!=null || !stack.isEmpty()){
			if(pRoot!=null){
				stack.push(pRoot);
				pRoot=pRoot.left;
			}else{
				TreeNode node=stack.pop();
				k--;
				if(k==0)
					return node;
				pRoot=node.right;
			}
		}
		return null;
	}
	
	void preOrder(TreeNode root){
		Stack<TreeNode> stack=new Stack<I�����������ĵ�k�����.TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode node=stack.pop();
			System.out.println(node.val);
			if(node.right!=null)
				stack.push(node.right);
			if(node.left!=null)
				stack.push(node.left);
		}
	}

	void postOrder(TreeNode root){
		Stack<TreeNode> stack1=new Stack<I�����������ĵ�k�����.TreeNode>();
		Stack<TreeNode> stack2=new Stack<I�����������ĵ�k�����.TreeNode>();
		stack1.push(root);
		while(!stack1.isEmpty()){
			TreeNode node=stack1.pop();
			stack2.push(node);
			if(node.left!=null)
				stack1.push(node.left);
			if(node.right!=null)
				stack2.push(node.right);
		}
	}
}
