package org.erhmutlu.algrthms.traversal;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryTreeHeapifier {

    public Node heapifyToMinHeap(Node root) {
        List<Node> nodes = new LinkedList<>();
        traverse(root, nodes);

        List<Node> sortedNodes = sort(nodes, Comparator.comparingInt(Node::getValue));

        return reassignChildNodes(sortedNodes);
    }

    public Node heapifyToMaxHeap(Node root) {
        List<Node> nodes = new LinkedList<>();
        traverse(root, nodes);

        Comparator<Node> valueComparator = Comparator.comparingInt(Node::getValue);
        List<Node> sortedNodes = sort(nodes, valueComparator.reversed());

        return reassignChildNodes(sortedNodes);
    }

    private void traverse(final Node node, final List<Node> nodes) {
        if (node == null) {
            return;
        }

        nodes.add(node);
        traverse(node.getLeftChild(), nodes);
        traverse(node.getRightChild(), nodes);
    }

    private List<Node> sort(List<Node> nodes, Comparator<Node> comparator) {
        return nodes
                .stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    private Node reassignChildNodes(List<Node> nodes) {
        Node[] nodesArr = new Node[nodes.size()];
        nodes.toArray(nodesArr);
        for (int i = 0; i < nodesArr.length; i++) {
            int left = i * 2 + 1;
            int right = left + 1;
            Node currentNode = nodesArr[i];
            currentNode.setLeftChild(left < nodesArr.length ? nodesArr[left] : null);
            currentNode.setRightChild(right < nodesArr.length ? nodesArr[right] : null);
        }

        return nodesArr[0];
    }
}
