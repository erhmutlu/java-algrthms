package org.erhmutlu.algrthms.traversal;

public class IterativeCommonAncestorNodeFinder {

    public Node find(Node node, int value1, int value2) {
        while (node != null) {
            if (isBothLessThan(value1, value2, node)) {
                node = node.getLeftChild();
            }

            if (isBothGreaterThan(value1, value2, node)) {
                node = node.getRightChild();
            }

            return node;
        }

        return null;
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
