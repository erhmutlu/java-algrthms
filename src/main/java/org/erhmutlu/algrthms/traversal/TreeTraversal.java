package org.erhmutlu.algrthms.traversal;

import java.util.LinkedList;
import java.util.List;

public class TreeTraversal {

    public List<Integer> preOrderTraverse(Node root) {
        List<Integer> values = new LinkedList<>();
        preOrderTraverse(root, values);
        return values;
    }

    public List<Integer> inOrderTraverse(Node root) {
        List<Integer> values = new LinkedList<>();
        inOrderTraverse(root, values);
        return values;
    }

    public List<Integer> postOrderTraverse(Node root) {
        List<Integer> values = new LinkedList<>();
        postOrderTraverse(root, values);
        return values;
    }

    private void preOrderTraverse(Node root, List<Integer> values) {
        if (root == null) {
            return;
        }

        values.add(root.getValue());
        preOrderTraverse(root.getLeftChild(), values);
        preOrderTraverse(root.getRightChild(), values);
    }

    private void inOrderTraverse(Node root, List<Integer> values) {
        if (root == null) {
            return;
        }

        inOrderTraverse(root.getLeftChild(), values);
        values.add(root.getValue());
        inOrderTraverse(root.getRightChild(), values);
    }

    private void postOrderTraverse(Node root, List<Integer> values) {
        if (root == null) {
            return;
        }

        postOrderTraverse(root.getLeftChild(), values);
        postOrderTraverse(root.getRightChild(), values);
        values.add(root.getValue());
    }
}
