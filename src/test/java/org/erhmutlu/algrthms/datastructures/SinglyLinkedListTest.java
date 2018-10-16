package org.erhmutlu.algrthms.datastructures;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SinglyLinkedListTest {

    @Test
    public void should_add() {
        //given
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        //when
        list.add(10);
        list.add(1);
        list.add(2);

        //then
        assertThat(list.toString()).isEqualTo("[10,1,2]");
    }

    @Test
    public void should_remove_with_index() {
        //given
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(20);
        list.add(22);
        list.add(100);

        //when
        list.remove(4);

        //then
        assertThat(list.toString()).isEqualTo("[10,1,2,20,100]");
    }

    @Test
    public void should_tail() {
        //given
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(22);
        list.add(100);

        //when
        Integer number = list.tail();

        //then
        assertThat(number).isEqualTo(100);
    }

    @Test
    public void should_head() {
        //given
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(21);
        list.add(100);

        //when
        Integer number = list.head();

        //then
        assertThat(number).isEqualTo(10);
    }
}