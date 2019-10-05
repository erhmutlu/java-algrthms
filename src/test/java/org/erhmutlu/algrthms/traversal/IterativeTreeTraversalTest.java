package org.erhmutlu.algrthms.traversal;

import org.erhmutlu.algrthms.TreeHelper;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class IterativeTreeTraversalTest {

    private IterativeTreeTraversal iterativeTreeTraversal = new IterativeTreeTraversal();

    @Test
    public void should_pre_order_traverse_tree() {
        //given
        Node rootNode = TreeHelper.prepareTree();

        //when
        List<Integer> values = iterativeTreeTraversal.preOrderTraverse(rootNode);

        //then
        assertThat(values).isEqualTo(new LinkedList<>(Arrays.asList(100, 50, 25, 75, 150, 125, 110, 175)));
    }
}