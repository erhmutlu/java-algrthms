package org.erhmutlu.algrthms.traversal;

public class CommonAncestorNodeFinder {

    public Node find(Node root, int value1, int value2) {
        if (isBothLessThan(value1, value2, root)) {
            return find(root.getLeftChild(), value1, value2);
        }

        if (isBothGreaterThan(value1, value2, root)) {
            return find(root.getRightChild(), value1, value2);
        }

        return root;
    }

    private boolean isBothGreaterThan(int value1, int value2, Node node) {
        Integer currentValue = node.getValue();
        return value1 > currentValue && value2 > currentValue;
    }

    private boolean isBothLessThan(int value1, int value2, Node node) {
        Integer currentValue = node.getValue();
        return value1 < currentValue && value2 < currentValue;
    }
}
