package com.b;

import java.util.LinkedList;
import java.util.Queue;

import com.a.Q�����ӽṹ.TreeNode;

public class K����������� {
	/*
	 * ����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
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
