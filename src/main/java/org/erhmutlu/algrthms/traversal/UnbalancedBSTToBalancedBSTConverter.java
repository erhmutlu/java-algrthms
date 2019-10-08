package org.erhmutlu.algrthms.traversal;

import java.util.LinkedList;
import java.util.List;

public class UnbalancedBSTToBalancedBSTConverter {

    public Node convert(Node root) {
        List nodes = new LinkedList<>();
        traverseInOrder(root, nodes);

        return buildTree(nodes, 0, nodes.size() - 1);
    }

    private void traverseInOrder(final Node node, final List<Node> nodes) {
        if (node == null) {
            return;
        }

        traverseInOrder(node.getLeftChild(), nodes);
        nodes.add(node);
        traverseInOrder(node.getRightChild(), nodes);
    }

    private Node buildTree(final List<Node> nodes, int min, int max) {
        int mid = findMid(min, max);
        Node root = nodes.get(mid);

        if (mid != min && mid != max) {
            Node leftChild = buildTree(nodes, min, mid - 1);
            root.setLeftChild(leftChild);

            Node rightChild = buildTree(nodes, mid + 1, max);
            root.setRightChild(rightChild);
        } else {
            root.setLeftChild(null);
            root.setRightChild(null);
        }

        return root;
    }

    private int findMid(int min, int max) {
        return (int) Math.floor((min + max) / 2);
    }
}
