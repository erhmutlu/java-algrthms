package org.erhmutlu.algrthms.traversal;

import static org.assertj.core.api.Assertions.assertThat;

import org.erhmutlu.algrthms.TreeHelper;
import org.junit.Test;

public class IterativeCommonAncestorNodeFinderTest {

    private IterativeCommonAncestorNodeFinder iterativeCommonAncestorNodeFinder = new IterativeCommonAncestorNodeFinder();

    @Test
    public void should_find_lowest_common_ancestor_node() {
        //given
        Node rootNode = TreeHelper.prepareTree();

        //when
        Node lowestAncestorNode = iterativeCommonAncestorNodeFinder.find(rootNode, 175, 110);

        //then
        assertThat(lowestAncestorNode.getValue()).isEqualTo(150);
    }
}