package org.erhmutlu.algrthms.traversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class IterativeTreeTraversal {

    public List<Integer> preOrderTraverse(Node root) {
        List<Integer> values = new LinkedList<>();

        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            values.add(node.getValue());
            if (node.getRightChild() != null) {
                stack.push(node.getRightChild());

            }
            if (node.getLeftChild() != null) {
                stack.push(node.getLeftChild());
            }
        }

        return values;
    }
}
