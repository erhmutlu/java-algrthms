package org.erhmutlu.algrthms;


import org.erhmutlu.algrthms.traversal.Node;

public class TreeHelper {

    public static Node prepareTree() {
        Node root = prepareNode(100);

        Node node50 = prepareNode(50);
        node50.setLeftChild(prepareNode(25));
        node50.setRightChild(prepareNode(75));
        root.setLeftChild(node50);


        Node node125 = prepareNode(125);
        node125.setLeftChild(prepareNode(110));

        Node node150 = prepareNode(150);
        node150.setLeftChild(node125);
        node150.setRightChild(prepareNode(175));
        root.setRightChild(node150);

        return root;
    }

    private static Node prepareNode(Integer value) {
        Node node = new Node();
        node.setValue(value);
        return node;
    }
}
