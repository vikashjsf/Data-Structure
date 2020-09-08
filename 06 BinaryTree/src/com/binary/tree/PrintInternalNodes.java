package com.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintInternalNodes {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(25);
		binaryTree.insert(20);
		binaryTree.insert(36);
		binaryTree.insert(10);
		binaryTree.insert(22);
		binaryTree.insert(30);
		binaryTree.insert(40);
		binaryTree.insert(5);
		binaryTree.insert(12);
		binaryTree.insert(28);
		binaryTree.insert(38);
		binaryTree.insert(48);
		System.out.println();
		
		levelOrderTraversal(binaryTree.root);
	}
	
	public static void levelOrderTraversal(TreeNode root) {
		if (root != null) {
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.offer(root);
			while (!queue.isEmpty()) {
				boolean isInternal=false;
				TreeNode treeNode = queue.poll();
				if (treeNode.left != null) {
					queue.offer(treeNode.left);
					isInternal=true;
				}
				if (treeNode.right != null) {
					queue.offer(treeNode.right);
					isInternal=true;
				}
				if(isInternal) {
					System.out.print(treeNode.data +" ");
				}
			}
		}
	}
}
