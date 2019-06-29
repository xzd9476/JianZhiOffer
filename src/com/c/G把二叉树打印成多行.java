package com.c;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class G把二叉树打印成多行 {
	/*
	 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
	 */
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> listAll=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		TreeNode last=pRoot;
		TreeNode theLast=null;
		if(pRoot!=null)
		queue.add(pRoot);
		while(!queue.isEmpty()){
			TreeNode node=queue.poll();
			list.add(node.val);
			if(node.left!=null){
				theLast=node.left;
				queue.add(node.left);
			}
			if(node.right!=null){
				theLast=node.right;
				queue.add(node.right);
			}
			if(last==node){
				last=theLast;
				listAll.add(list);
				list=new ArrayList<Integer>();
			}
		}
		return listAll;
	}

}
