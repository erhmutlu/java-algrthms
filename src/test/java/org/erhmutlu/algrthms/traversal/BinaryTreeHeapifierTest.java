package org.erhmutlu.algrthms.traversal;

import org.erhmutlu.algrthms.TreeHelper;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreeHeapifierTest {

    private BinaryTreeHeapifier binaryTreeHeapifier = new BinaryTreeHeapifier();

    @Test
    public void should_heapify_to_min_heap() {
        //given
        Node rootNode = TreeHelper.prepareUnbalancedTree();

        //when
        Node node = binaryTreeHeapifier.heapifyToMinHeap(rootNode);

        //then
        List<Integer> values = new TreeTraversal().preOrderTraverse(node);
        assertThat(values).isEqualTo(new LinkedList<>(Arrays.asList(4, 8, 12, 14, 10, 20, 22)));
    }

    @Test
    public void should_heapify_to_max_heap() {
        //given
        Node rootNode = TreeHelper.prepareUnbalancedTree();

        //when
        Node node = binaryTreeHeapifier.heapifyToMaxHeap(rootNode);

        //then
        List<Integer> values = new TreeTraversal().preOrderTraverse(node);
        assertThat(values).isEqualTo(new LinkedList<>(Arrays.asList(22, 20, 12, 10, 14, 8, 4)));
    }
}