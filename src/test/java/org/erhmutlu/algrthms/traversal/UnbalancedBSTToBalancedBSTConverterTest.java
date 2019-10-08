package org.erhmutlu.algrthms.traversal;

import static org.assertj.core.api.Assertions.assertThat;

import org.erhmutlu.algrthms.TreeHelper;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UnbalancedBSTToBalancedBSTConverterTest {

    private UnbalancedBSTToBalancedBSTConverter unbalancedBSTToBalancedBSTConverter = new UnbalancedBSTToBalancedBSTConverter();

    @Test
    public void should_convert_unbalanced_bst_to_balanced_bst() {
        //given
        Node rootNode = TreeHelper.prepareUnbalancedTree();

        //when
        Node newRootNode = unbalancedBSTToBalancedBSTConverter.convert(rootNode);

        //then
        List<Integer> values = new TreeTraversal().preOrderTraverse(newRootNode);
        assertThat(values).isEqualTo(new LinkedList<>(Arrays.asList(12, 8, 4, 10, 20, 14, 22)));
    }
}