package org.erhmutlu.algrthms.traversal;

import org.erhmutlu.algrthms.TreeHelper;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TreeTraversalTest {

    private TreeTraversal treeTraversal = new TreeTraversal();

    @Test
    public void should_pre_order_traverse_tree() {
        //given
        Node rootNode = TreeHelper.prepareTree();

        //when
        List<Integer> values = treeTraversal.preOrderTraverse(rootNode);

        //then
        assertThat(values).isEqualTo(new LinkedList<>(Arrays.asList(100, 50, 25, 75, 150, 125, 110, 175)));
    }

    @Test
    public void should_in_order_traverse_tree() {
        //given
        Node rootNode = TreeHelper.prepareTree();

        //when
        List<Integer> values = treeTraversal.inOrderTraverse(rootNode);

        //then
        assertThat(values).isEqualTo(new LinkedList<>(Arrays.asList(25, 50, 75, 100, 110, 125, 150, 175)));
    }

    @Test
    public void should_post_order_traverse_tree() {
        //given
        Node rootNode = TreeHelper.prepareTree();

        //when
        List<Integer> values = treeTraversal.postOrderTraverse(rootNode);

        //then
        assertThat(values).isEqualTo(new LinkedList<>(Arrays.asList(25, 75, 50, 110, 125, 175, 150, 100)));
    }
}