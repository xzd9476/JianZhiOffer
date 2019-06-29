package com.c;

public class D����������һ����� {
	/*
	 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء� ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
	 */

	public class TreeLinkNode {
		int val;
		TreeLinkNode left = null;
		TreeLinkNode right = null;
		TreeLinkNode next = null;

		TreeLinkNode(int val) {
			this.val = val;
		}
	}

	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if (pNode == null)
			return null;
		if (pNode.right != null) {
			pNode = pNode.right;
			while (pNode.left != null)
				pNode = pNode.left;
			return pNode;
		} else {
			while (pNode.next != null) {
				if (pNode == pNode.next.left) {
					return pNode.next;
				} else if (pNode == pNode.next.right) {
					pNode = pNode.next;
				}
			}
		}
		return null;
	}
}
