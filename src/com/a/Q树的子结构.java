package com.a;


public class Q树的子结构 {
	/*
	 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
	 */
	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if(root2 == null)
			return false;
		StringBuilder sb1=new StringBuilder("");
		StringBuilder sb2=new StringBuilder("");
		
		preOrder(root1,sb1);
		preOrder(root2,sb2);
		String str1=String.valueOf(sb1);
		String str2=String.valueOf(sb2);
		boolean flag=false;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)==str2.charAt(0)){
				int endIndex=i+str2.length()>str1.length()?str1.length():i+str2.length();
				if(str1.substring(i, endIndex).equals(str2)){
					flag=true;
				}
			}
		}
		return flag;
		
	}

	private static void preOrder(TreeNode root, StringBuilder sb) {
		if(root==null)
			return;
		sb.append(root.val);
		preOrder(root.left, sb);
		preOrder(root.right, sb);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(5);

		TreeNode root2 = new TreeNode(2);
		root2.right = new TreeNode(3);

		System.out.println(HasSubtree(root, root2));
	}

}
