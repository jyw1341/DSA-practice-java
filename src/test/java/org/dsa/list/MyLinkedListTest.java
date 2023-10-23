package org.dsa.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

    @Test
    @DisplayName("링크드 리스트 어펜드 테스트")
    void testMyLinkedListAppend() {
        //given
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        //when
        myLinkedList.add("1");
        myLinkedList.add("2");
        //then


    }
}