package org.erhmutlu.algrthms.search;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchAlgorithmTest {

    @Test
    public void should_find_searched_term() {
        //given
        List<Integer> testData = prepareTestData();

        //when & then
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 1)).isEqualTo(0);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 2)).isEqualTo(1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 5)).isEqualTo(2);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 6)).isEqualTo(3);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 7)).isEqualTo(4);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 9)).isEqualTo(5);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 10)).isEqualTo(6);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 20)).isEqualTo(7);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 30)).isEqualTo(8);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 32)).isEqualTo(9);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 47)).isEqualTo(10);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 67)).isEqualTo(11);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 72)).isEqualTo(12);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 77)).isEqualTo(13);
    }

    @Test
    public void should_not_find_searched_term() {
        //given
        List<Integer> testData = prepareTestData();

        //when & then
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 0)).isEqualTo(-1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 3)).isEqualTo(-1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 4)).isEqualTo(-1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 11)).isEqualTo(-1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 12)).isEqualTo(-1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 13)).isEqualTo(-1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 14)).isEqualTo(-1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 19)).isEqualTo(-1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 21)).isEqualTo(-1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 35)).isEqualTo(-1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 71)).isEqualTo(-1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 76)).isEqualTo(-1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 78)).isEqualTo(-1);
        Assertions.assertThat(BinarySearchAlgorithm.apply(testData, 100)).isEqualTo(-1);
    }

    private List<Integer> prepareTestData() {
        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(5);
        sortedList.add(6);
        sortedList.add(7);
        sortedList.add(9);
        sortedList.add(10);
        sortedList.add(20);
        sortedList.add(30);
        sortedList.add(32);
        sortedList.add(47);
        sortedList.add(67);
        sortedList.add(72);
        sortedList.add(77);
        return sortedList;
    }
}