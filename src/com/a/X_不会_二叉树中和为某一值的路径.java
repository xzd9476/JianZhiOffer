package com.a;

import java.util.ArrayList;

import com.a.V�������´�ӡ������.TreeNode;

public class X_����_�������к�Ϊĳһֵ��·�� {
	/*
	 * ����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
	 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·���� (ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
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
