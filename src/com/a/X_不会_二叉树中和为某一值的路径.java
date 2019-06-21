package com.a;

import java.util.ArrayList;

import com.a.V从上往下打印二叉树.TreeNode;

public class X_不会_二叉树中和为某一值的路径 {
	/*
	 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
	 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。 (注意: 在返回值的list中，数组长度大的数组靠前)
	 */
	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	private static ArrayList<ArrayList<Integer>> listAll=new ArrayList<ArrayList<Integer>>();
	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		find(root,target,new ArrayList<Integer>());
		return listAll;
	}
	
	

	private static void find(TreeNode root, int target, ArrayList<Integer> path) {
		if(root == null)
			return;
		path.add(root.val);
		target-=root.val;
		if(target == 0 && root.left==null && root.right==null){
			listAll.add(new ArrayList<Integer>(path));
		}else{
			find(root.left,target,path);
			find(root.right,target,path);
		}
		path.remove(path.size()-1);
	}


	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(5);
		root.left.left.right = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);

		ArrayList<ArrayList<Integer>> list = FindPath(root, 10);
		for (ArrayList<Integer> arrayList : list) {
			System.out.println("------");
			for (Integer integer : arrayList) {
				System.out.println(integer);
			}
		}
	}

}
