package com.c;

public class H序列化二叉树 {
	/*
	 * 请实现两个函数，分别用来序列化和反序列化二叉树
	 */

	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	private static int index = -1;
	static String Serialize(TreeNode root) {
		StringBuffer sb = new StringBuffer();
		if (root == null) {
			sb.append("#,");
			return sb.toString();
		}
		sb.append(root.val + ",");
		sb.append(Serialize(root.left));
		sb.append(Serialize(root.right));
		return sb.toString();
	}

	static TreeNode Deserialize(String str) {
		index++;
		int len = str.length();
		if (index >= len) {
			return null;
		}
		String[] strr = str.split(",");
		TreeNode node = null;
		if (!strr[index].equals("#")) {
			node = new TreeNode(Integer.valueOf(strr[index]));
			node.left = Deserialize(str);
			node.right = Deserialize(str);
		}

		return node;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(9);
		TreeNode node = Deserialize("5,4,#,3,#,2");
		System.out.println(Serialize(node));
		System.out.println(Serialize(root));
	}

}
