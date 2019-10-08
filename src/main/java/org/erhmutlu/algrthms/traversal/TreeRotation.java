package org.erhmutlu.algrthms.traversal;

public class TreeRotation {

    public static Node rotateRight(Node oldRoot) {
        Node newRoot = oldRoot.getLeftChild();
        oldRoot.setLeftChild(newRoot.getRightChild());
        newRoot.setRightChild(oldRoot);
        return newRoot;
    }

    public static Node rotateLeft(Node oldRoot) {
        Node newRoot = oldRoot.getRightChild();
        oldRoot.setRightChild(newRoot.getLeftChild());
        newRoot.setLeftChild(oldRoot);
        return newRoot;
    }

}
