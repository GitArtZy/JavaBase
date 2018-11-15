package com.training.LeetCode;

//��������������������С��ȡ���С����Ǹ��ڵ㵽�����Ҷ�ڵ�����·���ϵĽڵ�����

import java.util.LinkedList;
import java.util.Queue;

public class MinTreeNode {

    private static int x;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(x);
        run(root);
    }

    public static int run(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        int depth = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            depth++;
            for (int i = 0; i < len; i++) {
                TreeNode node = q.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }
        return depth;
    }
}
